

-- 用户表

create table if not exists User(
    id int primary key auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    email varchar(255) not null,
    phone varchar(255) not null,
    create_time timestamp not null default current_timestamp
);


-- 语音指令表

create table if not exists VoiceInstruction(
    id int primary key auto_increment,
    instruction varchar(255) not null,
    create_time timestamp not null default current_timestamp
);

-- 用户历史语音指令表

create table if not exists UserVoiceInstruction(
    id int primary key auto_increment,
    user_id int not null,
    voice_instruction_id int not null,
    create_time timestamp not null default current_timestamp,
    foreign key (user_id) references User(id),
    foreign key (voice_instruction_id) references VoiceInstruction(id)
);


-- 应用程序接口表

create table if not exists ApplicationInterface(
    id int primary key auto_increment,
    name varchar(255) not null,
    url varchar(255) not null,
    create_time timestamp not null default current_timestamp
);




-- 手机屏幕的图像上支持操作的区域，接受语音指令，并执行当前屏幕上的操作

create table if not exists ScreenOperation(
    id int primary key auto_increment,
    name varchar(255) not null,
    x int not null,
    y int not null,
    width int not null,
    height int not null,
    application_interface_id int not null,
    create_time timestamp not null default current_timestamp,
    foreign key (application_interface_id) references ApplicationInterface(id)
);



-- 语音指令与手机屏幕操作的映射表

create table if not exists VoiceInstructionMapping(
    id int primary key auto_increment,
    voice_instruction_id int not null,
    screen_operation_id int not null,
    create_time timestamp not null default current_timestamp,
    foreign key (voice_instruction_id) references VoiceInstruction(id),
    foreign key (screen_operation_id) references ScreenOperation(id)
);



-- 执行记录表

create table if not exists ExecutionRecord(
    id int primary key auto_increment,
    user_id int not null,
    voice_instruction_id int not null,
    screen_operation_id int not null,
    create_time timestamp not null default current_timestamp,
    foreign key (user_id) references User(id),
    foreign key (voice_instruction_id) references VoiceInstruction(id),
    foreign key (screen_operation_id) references ScreenOperation(id)
);

-- 日志表

create table if not exists Log(
    id int primary key auto_increment,
    level varchar(255) not null,
    message varchar(255) not null,
    create_time timestamp not null default current_timestamp
);




