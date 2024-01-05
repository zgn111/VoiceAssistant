# android前端开发

## 1. 项目结构
    
    ```
    ├── app
    │   ├── build.gradle
    │   ├── libs
    │   ├── proguard-rules.pro
    │   └── src
    │       ├── androidTest
    │       ├── main
    │       │   ├── AndroidManifest.xml 
    │       │   ├── java
    │       │   │   └── com
    │       │   │       └── example
    │       │   │           └── app
    │       │   │               ├── App.java
    │       │   │               ├── base
    ```

## 2. 命名规范

### 2.1 包名

包名全部小写，连续的单词只是简单地连接起来，不使用下划线，采用反域名命名规则，全部使用小写字母。
res包名：以模块名开头，如：main，login.


## 3. 代码实现过程问题

1. ConstraintLayout布局
2. bias属性:0.5表示居中,0表示左边,1表示右边
3. layout_constraintHorizontal_bias:水平方向的偏移量
4. layout_constraintVertical_bias:垂直方向的偏移量
5. ratio:宽高比
6. menu无法修改颜色
7. 图片太大会导致内存溢出,注意把图片放在drawable-xxhdpi目录下


```
VoiceAssistant
├─ .git
│  ├─ COMMIT_EDITMSG
│  ├─ config
│  ├─ description
│  ├─ FETCH_HEAD
│  ├─ fsmonitor--daemon
│  │  └─ cookies
│  ├─ HEAD
│  ├─ hooks
│  │  ├─ applypatch-msg.sample
│  │  ├─ commit-msg.sample
│  │  ├─ fsmonitor-watchman.sample
│  │  ├─ post-update.sample
│  │  ├─ pre-applypatch.sample
│  │  ├─ pre-commit.sample
│  │  ├─ pre-merge-commit.sample
│  │  ├─ pre-push.sample
│  │  ├─ pre-rebase.sample
│  │  ├─ pre-receive.sample
│  │  ├─ prepare-commit-msg.sample
│  │  ├─ push-to-checkout.sample
│  │  └─ update.sample
│  ├─ index
│  ├─ info
│  │  └─ exclude
│  ├─ logs
│  │  ├─ HEAD
│  │  └─ refs
│  │     ├─ heads
│  │     │  └─ main
│  │     └─ remotes
│  │        └─ vafe
│  │           └─ main
│  ├─ objects
│  │  ├─ 00
│  │  │  └─ bd82538aa897f076d3f310962ec2a4b055aeaf
│  │  ├─ 01
│  │  │  └─ 40f12e547bdc38e06ae9913f9b05e4adc7af50
│  │  ├─ 07
│  │  │  ├─ 615786dd22a6c2df1ebd0b3a53fcd204d49d6c
│  │  │  └─ d5da9cbf141911847041df5d7b87f0dd5ef9d4
│  │  ├─ 0c
│  │  │  └─ bb98f1fc4bf2a28561c244a76a07b5e937432b
│  │  ├─ 10
│  │  │  └─ 7acd32c4e687021ef32db511e8a206129b88ec
│  │  ├─ 11
│  │  │  └─ b3dee6370ac0c089d38c5315941a6b094051c2
│  │  ├─ 12
│  │  │  ├─ 17e928894cecf247fd980964e5e9f7fad16e4e
│  │  │  ├─ 96b21c55a8699fa771307172b610273e8c1d8b
│  │  │  └─ d9f206c31e04a16ef12088d7964c2483e25d9f
│  │  ├─ 13
│  │  │  ├─ 27327f89aa9bc67d0d4dbcbd0c6ca148ef1f9a
│  │  │  └─ c5314b75eda8380f97a89043da7a32d54eb64b
│  │  ├─ 14
│  │  │  └─ 6812fb1fe5307ffcd4ba94e4cfe6970a7e3593
│  │  ├─ 16
│  │  │  └─ a8cb8890e3e6dd29b0eec3d9b0f5352f16f7a3
│  │  ├─ 17
│  │  │  └─ 5d580461953b348e245edef0dfbbf00d9e2f8e
│  │  ├─ 19
│  │  │  ├─ 60d09b60c6908233936fbe4d5be23ba60aaa8a
│  │  │  └─ fefdf2f8f3c16099d8262035f0750f8cac7c62
│  │  ├─ 1a
│  │  │  └─ ad606672fda0f0dc3fc76021e618f52df3ab41
│  │  ├─ 1b
│  │  │  ├─ 6521448a24683695be8d2958db6dd7529d495e
│  │  │  ├─ 9a6956b3acdc11f40ce2bb3f6efbd845cc243f
│  │  │  └─ f33d0e6f460c30413b1dc196b4251b64b2eb58
│  │  ├─ 1c
│  │  │  └─ 6804d66822e8ca796332785e3a7904b4c728ab
│  │  ├─ 1e
│  │  │  └─ e5f35ffaac608a16ea9cb163f1036b33ac3c82
│  │  ├─ 1f
│  │  │  └─ 719381a90ad177fb300335857e962e166db1a1
│  │  ├─ 21
│  │  │  └─ 9a2d202f75e988837df6e852ec6f1764ca2177
│  │  ├─ 22
│  │  │  └─ 75b6413c5f25fbabc8ba5b9e063aa1bc30b982
│  │  ├─ 23
│  │  │  └─ 7ef9c9bd65bc6660a477f3ec4bb07e9d7c8977
│  │  ├─ 24
│  │  │  └─ 3f056ee39284d1f55d4e8da3dce6d8affe1295
│  │  ├─ 25
│  │  │  └─ ddfd0312b8c12a60a099a71c605531a4800436
│  │  ├─ 27
│  │  │  └─ c2bf5866bcb092a4c32865102d1da37c0a9b68
│  │  ├─ 28
│  │  │  └─ d4b77f9f036a47549d47db79c16788749dca10
│  │  ├─ 2b
│  │  │  └─ 068d11462a4b96669193de13a711a3a36220a0
│  │  ├─ 2f
│  │  │  ├─ 327f4eea0cc1a140b14f20e1968339b4f1f61e
│  │  │  ├─ 6f49daf8483b153a5a11ae8321bff2f7f74d6b
│  │  │  └─ e521cf3507fda5b3325621d10953cdb1982f51
│  │  ├─ 31
│  │  │  └─ e7d4a32f55aba9efd136db4af4ac0ad1ddcdf4
│  │  ├─ 35
│  │  │  └─ 9bb5307e8535ab7d59faf27a7377033291821e
│  │  ├─ 36
│  │  │  └─ 7ba088b6478dcb253a9cd179f2a8f21264cf23
│  │  ├─ 38
│  │  │  └─ ffcd024691f78fc0e4ebff2afdb362cf1bef58
│  │  ├─ 3d
│  │  │  └─ aed1d8292ff5febafe3ac95c9bc1b354958196
│  │  ├─ 41
│  │  │  └─ 1417839dca4523670fca254f02b0ae448aa51f
│  │  ├─ 42
│  │  │  ├─ 022c214b8c47a5d5f9774197529f763d5716a0
│  │  │  └─ afabfd2abebf31384ca7797186a27a4b7dbee8
│  │  ├─ 44
│  │  │  └─ 2c769043d7491f43f35d3e85afc45561bba3ed
│  │  ├─ 46
│  │  │  └─ 123c8a05f7c8ae0d069692786b4f3b1a0648d7
│  │  ├─ 48
│  │  │  └─ 1bb434814107eb79d7a30b676d344b0df2f8ce
│  │  ├─ 4e
│  │  │  └─ 9039d72650c21335f95e2c2243a04d72270cee
│  │  ├─ 4f
│  │  │  ├─ 0f1d64e58ba64d180ce43ee13bf9a17835fbca
│  │  │  └─ 906e0c811fc9e230eb44819f509cd0627f2600
│  │  ├─ 55
│  │  │  └─ 11dc4162c97453a1d0494ff94402d4b0146579
│  │  ├─ 58
│  │  │  └─ 82c5e7e3a33032560b4bf3dee8438d683bbc89
│  │  ├─ 59
│  │  │  ├─ 2c261760ae3ae6d451e17b2a3de4e78335f6c7
│  │  │  └─ a02a1d8fea67e0f2591ebf6f644c1b979a4ef6
│  │  ├─ 5a
│  │  │  └─ 870f557b451949c3c80f22d8c6224533f51a60
│  │  ├─ 5c
│  │  │  └─ fcc7ae084608c8b8e6f2c18d6a9c6e4c4f5317
│  │  ├─ 61
│  │  │  ├─ 209b6b58bd14ecb4a0fffa1efaa697b5614eb7
│  │  │  └─ 8cfb988c62fdafca09ee4cf6c136768eb3f48b
│  │  ├─ 62
│  │  │  └─ b611da081676d42f6c3f78a2c91e7bcedddedb
│  │  ├─ 64
│  │  │  └─ 6720096ef0b50f7334f283996101c7b5b3e5da
│  │  ├─ 6a
│  │  │  └─ 1c1c26a4ab1a3a8580622836a3fcb5aa53ee0c
│  │  ├─ 6c
│  │  │  └─ cd5bfbd48698ba04f6b95d609f364d336c4c10
│  │  ├─ 6e
│  │  │  └─ a3b944de763785c89b2822b778aa6e584ce2ae
│  │  ├─ 6f
│  │  │  ├─ 3b755bf50c6b03d8714a9c6184705e6a08389f
│  │  │  └─ 64523b5fe4d0ced56ab514740fa50c6cc6d1c7
│  │  ├─ 70
│  │  │  └─ 95c434f8119e58167a89faaa832164f8473a2c
│  │  ├─ 78
│  │  │  └─ f0ddbb45a6d0893ad973b8820ec9c5b9907fb3
│  │  ├─ 7b
│  │  │  ├─ b0cecb15e354e11d782f41607e57b681d7ed1f
│  │  │  └─ ee6b70895e0fec0ddcb2d9a211409c7288eaba
│  │  ├─ 7f
│  │  │  └─ 6692504724d3819dc2e8fee2ca5ce62d9f29e6
│  │  ├─ 82
│  │  │  └─ 77ee4530a18e7d0445a82951c51b6117f7beb2
│  │  ├─ 84
│  │  │  ├─ 1f3effcc75352bc5733ba5e9168424bd9b2b30
│  │  │  ├─ 35d73166dddd2edaf03b8060757eb9a81027bd
│  │  │  └─ 52791cfd2d974df68bfdf74dfa9bc0f4d353b1
│  │  ├─ 89
│  │  │  └─ 4cd1d5cd4c69efb022798b675a6bb330eb5bdf
│  │  ├─ 8a
│  │  │  └─ 4470d9f3fbf4f63655ded86420047dd2ee1a56
│  │  ├─ 8b
│  │  │  └─ 83b271a9d83dedd52babc828ee64c60337759f
│  │  ├─ 8d
│  │  │  └─ 2e381df87cdabbb531670d9c9c8793f125e7b3
│  │  ├─ 8e
│  │  │  ├─ c04b45e31cdcd6e2c040b1a9bd0d0489155c3c
│  │  │  └─ e6c3f79a7169702892c585098b0981b72a5184
│  │  ├─ 91
│  │  │  ├─ 26ae37cbc3587421d6889eadd1d91fbf1994d4
│  │  │  └─ 506cbc2d89b7f0497c413399c2aec4d6db291a
│  │  ├─ 92
│  │  │  └─ 87f5083623b375139afb391af71cc533a7dd37
│  │  ├─ 93
│  │  │  └─ 527e2fd37bfd6bb01f2f20d86ff4e4c4a06d2f
│  │  ├─ 94
│  │  │  ├─ 8a3070fe34c611c42c0d3ad3013a0dce358be0
│  │  │  ├─ a25f7f4cb416c083d265558da75d457237d671
│  │  │  └─ f477125ed63bafdab08c9520cc700ec726b836
│  │  ├─ 96
│  │  │  ├─ 0f0a4cb6806bd49607581251acd387813f5b6c
│  │  │  └─ 61d3fa820b4b71022bdff509288e2c3ef5733f
│  │  ├─ 97
│  │  │  └─ c3cc83f2e0b7e53fff8e3c11c10ca82c635b55
│  │  ├─ 9b
│  │  │  └─ 44378bd2da1f0cc324449bd2bfe48afa20c886
│  │  ├─ 9e
│  │  │  └─ e9997b0b4726e57c27b2f7b21462b604ff8a88
│  │  ├─ a3
│  │  │  ├─ 9c1b376872c0267a78c1d3c0ee701b40b01e24
│  │  │  └─ de34961096076e3ad578310142d8e33859d1bb
│  │  ├─ a5
│  │  │  ├─ 6cedac79297d90cc56d1483b939806b921859d
│  │  │  └─ fa8766a7e632ab5a0e03ff688be7246a3e007f
│  │  ├─ a9
│  │  │  └─ 6765479463590359786eb644dadb3b9c2b559e
│  │  ├─ aa
│  │  │  ├─ 724b77071afcbd9bb398053e05adaf7ac9405a
│  │  │  ├─ 7d6427e6fa1074b79ccd52ef67ac15c5637e85
│  │  │  └─ cedaecf598e58c07ef4c16ac7042dc0b233711
│  │  ├─ ab
│  │  │  └─ 55130571f977ffdd88b9c4abbf83ce79e819b4
│  │  ├─ b2
│  │  │  └─ dfe3d1ba5cf3ee31b3ecc1ced89044a1f3b7a9
│  │  ├─ b5
│  │  │  ├─ 89d56e9f285d8cfdc6c270853a5d439021a278
│  │  │  └─ f3b2374c8469c0789e5419af77429310547865
│  │  ├─ b6
│  │  │  └─ 346aed29991f9dca4477a304c9f71db8821ddd
│  │  ├─ b9
│  │  │  └─ 9a7826e9cc7447e546d25372a2dcdbca8a7ade
│  │  ├─ bb
│  │  │  └─ 70b86885095a0aa1f2a018a7de28cb73c765b9
│  │  ├─ be
│  │  │  └─ 1e76d81b96207aa84ac9dbca82937a34ac9e55
│  │  ├─ c0
│  │  │  └─ 33b6b2e70a2d6993c415f583601bc6745f63fb
│  │  ├─ c1
│  │  │  └─ 1be6a69bbaf6b5fccea62a01224dd8aec69116
│  │  ├─ c2
│  │  │  └─ 09e78ecd372343283f4157dcfd918ec5165bb3
│  │  ├─ c3
│  │  │  └─ 36f6e419d0095b50718aee4924a64edb22a114
│  │  ├─ c4
│  │  │  └─ c2fab631fe4ea00e8236ccf0d13c735175e46a
│  │  ├─ cf
│  │  │  ├─ 535190e36ea1bb0c50b5e9f2f206bed5d26f17
│  │  │  └─ f0325213520f31fb713b436949e0a3e7a78abd
│  │  ├─ d1
│  │  │  └─ d68490aa6286f611b45e96a598aa9b56b82f4a
│  │  ├─ d2
│  │  │  └─ a8b93f8415cb6ef9ffda94a7e5b9ec20a0a164
│  │  ├─ d5
│  │  │  └─ 9562bde490f0ef2bf56d0aaa97cb12cac267dd
│  │  ├─ d6
│  │  │  └─ ccb3099378f33a8541d913612d803362b5f2b4
│  │  ├─ d9
│  │  │  └─ a3315dbc2a0ba72eb5e2de32cf4f782be5bf13
│  │  ├─ df
│  │  │  └─ 5a24a8292477cdde4b6dce7af3de456b8d5ad4
│  │  ├─ e0
│  │  │  ├─ 0409856adb3367d0008db1b4b8a0b18fac4f99
│  │  │  └─ ad76afef0116c86435202e045eb5a8aa56a0c6
│  │  ├─ e2
│  │  │  └─ 26f42e909c055902cbf069839b176ada049558
│  │  ├─ e7
│  │  │  └─ 08b1c023ec8b20f512888fe07c5bd3ff77bb8f
│  │  ├─ eb
│  │  │  └─ 287923d8a985986afa4e255917c62fcfe8a6f9
│  │  ├─ ee
│  │  │  └─ 5502e6ebc8a4abdc0ee42e0846ee7e606f9016
│  │  ├─ ef
│  │  │  └─ 43123ac39145e57a18c4dfba44b5f842d5c309
│  │  ├─ f0
│  │  │  ├─ 0c4db5dd3006555ee378f1e3994a36c16c60c3
│  │  │  ├─ 1eec376fb3b06999b3e3ce71f6461416f4bff1
│  │  │  └─ c49846ff176634892b2cb0855b15c41a0aa5ee
│  │  ├─ fa
│  │  │  ├─ 0f996d2c2a6bdd11f5371de4268c8389d6c720
│  │  │  └─ 15bdce2a7c25cb409a9a1e5269a65453fb4805
│  │  ├─ fe
│  │  │  └─ 15cb61a60cd86a9399aa26187c696a5f37f73e
│  │  ├─ info
│  │  └─ pack
│  └─ refs
│     ├─ heads
│     │  └─ main
│     ├─ remotes
│     │  └─ vafe
│     │     └─ main
│     └─ tags
├─ .gitignore
├─ .idea
│  ├─ .gitignore
│  ├─ checkstyle-idea.xml
│  ├─ compiler.xml
│  ├─ gradle.xml
│  ├─ misc.xml
│  └─ vcs.xml
├─ app
│  ├─ .gitignore
│  ├─ libs
│  ├─ proguard-rules.pro
│  └─ src
│     ├─ androidTest
│     │  └─ java
│     │     └─ com
│     │        └─ example
│     │           └─ voiceassistant
│     │              └─ ExampleInstrumentedTest.java
│     ├─ main
│     │  ├─ AndroidManifest.xml
│     │  ├─ icons
│     │  │  ├─ login.svg
│     │  │  └─ password.svg
│     │  ├─ java
│     │  │  └─ com
│     │  │     └─ example
│     │  │        └─ voiceassistant
│     │  │           ├─ API
│     │  │           │  ├─ APIManager.java
│     │  │           │  └─ AuthAPI.java
│     │  │           ├─ Entity
│     │  │           │  ├─ Request
│     │  │           │  │  └─ UserAuthenticationRequest.java
│     │  │           │  └─ Response
│     │  │           │     └─ UserAuthenticationResponse.java
│     │  │           ├─ Public
│     │  │           ├─ Router
│     │  │           ├─ Service
│     │  │           │  ├─ BackStageService.java
│     │  │           │  └─ VoiceService.java
│     │  │           └─ View
│     │  │              ├─ Home
│     │  │              │  ├─ HomeFragment.java
│     │  │              │  └─ HomeView.java
│     │  │              └─ User
│     │  │                 ├─ LoginView.java
│     │  │                 ├─ RegisterView.java
│     │  │                 └─ UserFragment.java
│     │  └─ res
│     │     ├─ drawable
│     │     │  ├─ ic_home_home.xml
│     │     │  ├─ ic_home_user.xml
│     │     │  ├─ ic_launcher_background.xml
│     │     │  ├─ ic_login_account.xml
│     │     │  ├─ ic_login_back.xml
│     │     │  └─ ic_login_password.xml
│     │     ├─ drawable-nodpi
│     │     │  └─ pic_login_bg.webp
│     │     ├─ drawable-v24
│     │     │  └─ ic_launcher_foreground.xml
│     │     ├─ layout
│     │     │  ├─ fragment_home.xml
│     │     │  ├─ fragment_user.xml
│     │     │  ├─ home.xml
│     │     │  ├─ login.xml
│     │     │  └─ register.xml
│     │     ├─ layout-land
│     │     ├─ menu
│     │     │  └─ bottom_navigation_items.xml
│     │     ├─ mipmap-anydpi-v26
│     │     │  ├─ ic_launcher.xml
│     │     │  └─ ic_launcher_round.xml
│     │     ├─ mipmap-hdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-mdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xxhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xxxhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ values
│     │     │  ├─ colors.xml
│     │     │  ├─ dimens.xml
│     │     │  ├─ strings.xml
│     │     │  └─ themes.xml
│     │     ├─ values-night
│     │     │  └─ themes.xml
│     │     └─ xml
│     │        ├─ backup_rules.xml
│     │        └─ data_extraction_rules.xml
│     └─ test
│        └─ java
│           └─ com
│              └─ example
│                 └─ voiceassistant
│                    └─ ExampleUnitTest.java
├─ gradle
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradle.properties
├─ gradlew
├─ gradlew.bat
└─ README.md

```
```
VoiceAssistant
├─ .git
│  ├─ COMMIT_EDITMSG
│  ├─ config
│  ├─ description
│  ├─ FETCH_HEAD
│  ├─ fsmonitor--daemon
│  │  └─ cookies
│  ├─ HEAD
│  ├─ hooks
│  │  ├─ applypatch-msg.sample
│  │  ├─ commit-msg.sample
│  │  ├─ fsmonitor-watchman.sample
│  │  ├─ post-update.sample
│  │  ├─ pre-applypatch.sample
│  │  ├─ pre-commit.sample
│  │  ├─ pre-merge-commit.sample
│  │  ├─ pre-push.sample
│  │  ├─ pre-rebase.sample
│  │  ├─ pre-receive.sample
│  │  ├─ prepare-commit-msg.sample
│  │  ├─ push-to-checkout.sample
│  │  └─ update.sample
│  ├─ index
│  ├─ info
│  │  └─ exclude
│  ├─ logs
│  │  ├─ HEAD
│  │  └─ refs
│  │     ├─ heads
│  │     │  └─ main
│  │     └─ remotes
│  │        └─ vafe
│  │           └─ main
│  ├─ objects
│  │  ├─ 00
│  │  │  └─ bd82538aa897f076d3f310962ec2a4b055aeaf
│  │  ├─ 01
│  │  │  └─ 40f12e547bdc38e06ae9913f9b05e4adc7af50
│  │  ├─ 07
│  │  │  ├─ 615786dd22a6c2df1ebd0b3a53fcd204d49d6c
│  │  │  └─ d5da9cbf141911847041df5d7b87f0dd5ef9d4
│  │  ├─ 0c
│  │  │  └─ bb98f1fc4bf2a28561c244a76a07b5e937432b
│  │  ├─ 10
│  │  │  └─ 7acd32c4e687021ef32db511e8a206129b88ec
│  │  ├─ 11
│  │  │  └─ b3dee6370ac0c089d38c5315941a6b094051c2
│  │  ├─ 12
│  │  │  ├─ 17e928894cecf247fd980964e5e9f7fad16e4e
│  │  │  ├─ 96b21c55a8699fa771307172b610273e8c1d8b
│  │  │  └─ d9f206c31e04a16ef12088d7964c2483e25d9f
│  │  ├─ 13
│  │  │  ├─ 27327f89aa9bc67d0d4dbcbd0c6ca148ef1f9a
│  │  │  └─ c5314b75eda8380f97a89043da7a32d54eb64b
│  │  ├─ 14
│  │  │  └─ 6812fb1fe5307ffcd4ba94e4cfe6970a7e3593
│  │  ├─ 16
│  │  │  └─ a8cb8890e3e6dd29b0eec3d9b0f5352f16f7a3
│  │  ├─ 17
│  │  │  └─ 5d580461953b348e245edef0dfbbf00d9e2f8e
│  │  ├─ 19
│  │  │  ├─ 60d09b60c6908233936fbe4d5be23ba60aaa8a
│  │  │  └─ fefdf2f8f3c16099d8262035f0750f8cac7c62
│  │  ├─ 1a
│  │  │  └─ ad606672fda0f0dc3fc76021e618f52df3ab41
│  │  ├─ 1b
│  │  │  ├─ 6521448a24683695be8d2958db6dd7529d495e
│  │  │  ├─ 9a6956b3acdc11f40ce2bb3f6efbd845cc243f
│  │  │  └─ f33d0e6f460c30413b1dc196b4251b64b2eb58
│  │  ├─ 1c
│  │  │  └─ 6804d66822e8ca796332785e3a7904b4c728ab
│  │  ├─ 1e
│  │  │  └─ e5f35ffaac608a16ea9cb163f1036b33ac3c82
│  │  ├─ 1f
│  │  │  └─ 719381a90ad177fb300335857e962e166db1a1
│  │  ├─ 21
│  │  │  └─ 9a2d202f75e988837df6e852ec6f1764ca2177
│  │  ├─ 22
│  │  │  └─ 75b6413c5f25fbabc8ba5b9e063aa1bc30b982
│  │  ├─ 23
│  │  │  └─ 7ef9c9bd65bc6660a477f3ec4bb07e9d7c8977
│  │  ├─ 24
│  │  │  └─ 3f056ee39284d1f55d4e8da3dce6d8affe1295
│  │  ├─ 25
│  │  │  └─ ddfd0312b8c12a60a099a71c605531a4800436
│  │  ├─ 27
│  │  │  └─ c2bf5866bcb092a4c32865102d1da37c0a9b68
│  │  ├─ 28
│  │  │  └─ d4b77f9f036a47549d47db79c16788749dca10
│  │  ├─ 2b
│  │  │  └─ 068d11462a4b96669193de13a711a3a36220a0
│  │  ├─ 2f
│  │  │  ├─ 327f4eea0cc1a140b14f20e1968339b4f1f61e
│  │  │  ├─ 6f49daf8483b153a5a11ae8321bff2f7f74d6b
│  │  │  └─ e521cf3507fda5b3325621d10953cdb1982f51
│  │  ├─ 31
│  │  │  └─ e7d4a32f55aba9efd136db4af4ac0ad1ddcdf4
│  │  ├─ 35
│  │  │  └─ 9bb5307e8535ab7d59faf27a7377033291821e
│  │  ├─ 36
│  │  │  └─ 7ba088b6478dcb253a9cd179f2a8f21264cf23
│  │  ├─ 38
│  │  │  └─ ffcd024691f78fc0e4ebff2afdb362cf1bef58
│  │  ├─ 3d
│  │  │  └─ aed1d8292ff5febafe3ac95c9bc1b354958196
│  │  ├─ 41
│  │  │  └─ 1417839dca4523670fca254f02b0ae448aa51f
│  │  ├─ 42
│  │  │  ├─ 022c214b8c47a5d5f9774197529f763d5716a0
│  │  │  └─ afabfd2abebf31384ca7797186a27a4b7dbee8
│  │  ├─ 44
│  │  │  └─ 2c769043d7491f43f35d3e85afc45561bba3ed
│  │  ├─ 46
│  │  │  └─ 123c8a05f7c8ae0d069692786b4f3b1a0648d7
│  │  ├─ 48
│  │  │  └─ 1bb434814107eb79d7a30b676d344b0df2f8ce
│  │  ├─ 4e
│  │  │  └─ 9039d72650c21335f95e2c2243a04d72270cee
│  │  ├─ 4f
│  │  │  ├─ 0f1d64e58ba64d180ce43ee13bf9a17835fbca
│  │  │  └─ 906e0c811fc9e230eb44819f509cd0627f2600
│  │  ├─ 55
│  │  │  └─ 11dc4162c97453a1d0494ff94402d4b0146579
│  │  ├─ 58
│  │  │  └─ 82c5e7e3a33032560b4bf3dee8438d683bbc89
│  │  ├─ 59
│  │  │  ├─ 2c261760ae3ae6d451e17b2a3de4e78335f6c7
│  │  │  └─ a02a1d8fea67e0f2591ebf6f644c1b979a4ef6
│  │  ├─ 5a
│  │  │  └─ 870f557b451949c3c80f22d8c6224533f51a60
│  │  ├─ 5c
│  │  │  └─ fcc7ae084608c8b8e6f2c18d6a9c6e4c4f5317
│  │  ├─ 61
│  │  │  ├─ 209b6b58bd14ecb4a0fffa1efaa697b5614eb7
│  │  │  └─ 8cfb988c62fdafca09ee4cf6c136768eb3f48b
│  │  ├─ 62
│  │  │  └─ b611da081676d42f6c3f78a2c91e7bcedddedb
│  │  ├─ 64
│  │  │  └─ 6720096ef0b50f7334f283996101c7b5b3e5da
│  │  ├─ 6a
│  │  │  └─ 1c1c26a4ab1a3a8580622836a3fcb5aa53ee0c
│  │  ├─ 6c
│  │  │  └─ cd5bfbd48698ba04f6b95d609f364d336c4c10
│  │  ├─ 6e
│  │  │  └─ a3b944de763785c89b2822b778aa6e584ce2ae
│  │  ├─ 6f
│  │  │  ├─ 3b755bf50c6b03d8714a9c6184705e6a08389f
│  │  │  └─ 64523b5fe4d0ced56ab514740fa50c6cc6d1c7
│  │  ├─ 70
│  │  │  └─ 95c434f8119e58167a89faaa832164f8473a2c
│  │  ├─ 78
│  │  │  └─ f0ddbb45a6d0893ad973b8820ec9c5b9907fb3
│  │  ├─ 7b
│  │  │  ├─ b0cecb15e354e11d782f41607e57b681d7ed1f
│  │  │  └─ ee6b70895e0fec0ddcb2d9a211409c7288eaba
│  │  ├─ 7f
│  │  │  └─ 6692504724d3819dc2e8fee2ca5ce62d9f29e6
│  │  ├─ 82
│  │  │  └─ 77ee4530a18e7d0445a82951c51b6117f7beb2
│  │  ├─ 84
│  │  │  ├─ 1f3effcc75352bc5733ba5e9168424bd9b2b30
│  │  │  ├─ 35d73166dddd2edaf03b8060757eb9a81027bd
│  │  │  └─ 52791cfd2d974df68bfdf74dfa9bc0f4d353b1
│  │  ├─ 89
│  │  │  └─ 4cd1d5cd4c69efb022798b675a6bb330eb5bdf
│  │  ├─ 8a
│  │  │  └─ 4470d9f3fbf4f63655ded86420047dd2ee1a56
│  │  ├─ 8b
│  │  │  └─ 83b271a9d83dedd52babc828ee64c60337759f
│  │  ├─ 8d
│  │  │  └─ 2e381df87cdabbb531670d9c9c8793f125e7b3
│  │  ├─ 8e
│  │  │  ├─ c04b45e31cdcd6e2c040b1a9bd0d0489155c3c
│  │  │  └─ e6c3f79a7169702892c585098b0981b72a5184
│  │  ├─ 91
│  │  │  ├─ 26ae37cbc3587421d6889eadd1d91fbf1994d4
│  │  │  └─ 506cbc2d89b7f0497c413399c2aec4d6db291a
│  │  ├─ 92
│  │  │  └─ 87f5083623b375139afb391af71cc533a7dd37
│  │  ├─ 93
│  │  │  └─ 527e2fd37bfd6bb01f2f20d86ff4e4c4a06d2f
│  │  ├─ 94
│  │  │  ├─ 8a3070fe34c611c42c0d3ad3013a0dce358be0
│  │  │  ├─ a25f7f4cb416c083d265558da75d457237d671
│  │  │  └─ f477125ed63bafdab08c9520cc700ec726b836
│  │  ├─ 96
│  │  │  ├─ 0f0a4cb6806bd49607581251acd387813f5b6c
│  │  │  └─ 61d3fa820b4b71022bdff509288e2c3ef5733f
│  │  ├─ 97
│  │  │  └─ c3cc83f2e0b7e53fff8e3c11c10ca82c635b55
│  │  ├─ 9b
│  │  │  └─ 44378bd2da1f0cc324449bd2bfe48afa20c886
│  │  ├─ 9e
│  │  │  └─ e9997b0b4726e57c27b2f7b21462b604ff8a88
│  │  ├─ a3
│  │  │  ├─ 9c1b376872c0267a78c1d3c0ee701b40b01e24
│  │  │  └─ de34961096076e3ad578310142d8e33859d1bb
│  │  ├─ a5
│  │  │  ├─ 6cedac79297d90cc56d1483b939806b921859d
│  │  │  └─ fa8766a7e632ab5a0e03ff688be7246a3e007f
│  │  ├─ a9
│  │  │  └─ 6765479463590359786eb644dadb3b9c2b559e
│  │  ├─ aa
│  │  │  ├─ 724b77071afcbd9bb398053e05adaf7ac9405a
│  │  │  ├─ 7d6427e6fa1074b79ccd52ef67ac15c5637e85
│  │  │  └─ cedaecf598e58c07ef4c16ac7042dc0b233711
│  │  ├─ ab
│  │  │  └─ 55130571f977ffdd88b9c4abbf83ce79e819b4
│  │  ├─ b2
│  │  │  └─ dfe3d1ba5cf3ee31b3ecc1ced89044a1f3b7a9
│  │  ├─ b5
│  │  │  ├─ 89d56e9f285d8cfdc6c270853a5d439021a278
│  │  │  └─ f3b2374c8469c0789e5419af77429310547865
│  │  ├─ b6
│  │  │  └─ 346aed29991f9dca4477a304c9f71db8821ddd
│  │  ├─ b9
│  │  │  └─ 9a7826e9cc7447e546d25372a2dcdbca8a7ade
│  │  ├─ bb
│  │  │  └─ 70b86885095a0aa1f2a018a7de28cb73c765b9
│  │  ├─ be
│  │  │  └─ 1e76d81b96207aa84ac9dbca82937a34ac9e55
│  │  ├─ c0
│  │  │  └─ 33b6b2e70a2d6993c415f583601bc6745f63fb
│  │  ├─ c1
│  │  │  └─ 1be6a69bbaf6b5fccea62a01224dd8aec69116
│  │  ├─ c2
│  │  │  └─ 09e78ecd372343283f4157dcfd918ec5165bb3
│  │  ├─ c3
│  │  │  └─ 36f6e419d0095b50718aee4924a64edb22a114
│  │  ├─ c4
│  │  │  └─ c2fab631fe4ea00e8236ccf0d13c735175e46a
│  │  ├─ cf
│  │  │  ├─ 535190e36ea1bb0c50b5e9f2f206bed5d26f17
│  │  │  └─ f0325213520f31fb713b436949e0a3e7a78abd
│  │  ├─ d1
│  │  │  └─ d68490aa6286f611b45e96a598aa9b56b82f4a
│  │  ├─ d2
│  │  │  └─ a8b93f8415cb6ef9ffda94a7e5b9ec20a0a164
│  │  ├─ d5
│  │  │  └─ 9562bde490f0ef2bf56d0aaa97cb12cac267dd
│  │  ├─ d6
│  │  │  └─ ccb3099378f33a8541d913612d803362b5f2b4
│  │  ├─ d9
│  │  │  └─ a3315dbc2a0ba72eb5e2de32cf4f782be5bf13
│  │  ├─ df
│  │  │  └─ 5a24a8292477cdde4b6dce7af3de456b8d5ad4
│  │  ├─ e0
│  │  │  ├─ 0409856adb3367d0008db1b4b8a0b18fac4f99
│  │  │  └─ ad76afef0116c86435202e045eb5a8aa56a0c6
│  │  ├─ e2
│  │  │  └─ 26f42e909c055902cbf069839b176ada049558
│  │  ├─ e7
│  │  │  └─ 08b1c023ec8b20f512888fe07c5bd3ff77bb8f
│  │  ├─ eb
│  │  │  └─ 287923d8a985986afa4e255917c62fcfe8a6f9
│  │  ├─ ee
│  │  │  └─ 5502e6ebc8a4abdc0ee42e0846ee7e606f9016
│  │  ├─ ef
│  │  │  └─ 43123ac39145e57a18c4dfba44b5f842d5c309
│  │  ├─ f0
│  │  │  ├─ 0c4db5dd3006555ee378f1e3994a36c16c60c3
│  │  │  ├─ 1eec376fb3b06999b3e3ce71f6461416f4bff1
│  │  │  └─ c49846ff176634892b2cb0855b15c41a0aa5ee
│  │  ├─ fa
│  │  │  ├─ 0f996d2c2a6bdd11f5371de4268c8389d6c720
│  │  │  └─ 15bdce2a7c25cb409a9a1e5269a65453fb4805
│  │  ├─ fe
│  │  │  └─ 15cb61a60cd86a9399aa26187c696a5f37f73e
│  │  ├─ info
│  │  └─ pack
│  └─ refs
│     ├─ heads
│     │  └─ main
│     ├─ remotes
│     │  └─ vafe
│     │     └─ main
│     └─ tags
├─ .gitignore
├─ .idea
│  ├─ .gitignore
│  ├─ checkstyle-idea.xml
│  ├─ compiler.xml
│  ├─ gradle.xml
│  ├─ misc.xml
│  └─ vcs.xml
├─ app
│  ├─ .gitignore
│  ├─ libs
│  ├─ proguard-rules.pro
│  └─ src
│     ├─ androidTest
│     │  └─ java
│     │     └─ com
│     │        └─ example
│     │           └─ voiceassistant
│     │              └─ ExampleInstrumentedTest.java
│     ├─ main
│     │  ├─ AndroidManifest.xml
│     │  ├─ icons
│     │  │  ├─ login.svg
│     │  │  └─ password.svg
│     │  ├─ java
│     │  │  └─ com
│     │  │     └─ example
│     │  │        └─ voiceassistant
│     │  │           ├─ API
│     │  │           │  ├─ APIManager.java
│     │  │           │  └─ AuthAPI.java
│     │  │           ├─ Entity
│     │  │           │  ├─ Request
│     │  │           │  │  └─ UserAuthenticationRequest.java
│     │  │           │  └─ Response
│     │  │           │     └─ UserAuthenticationResponse.java
│     │  │           ├─ Public
│     │  │           ├─ Router
│     │  │           ├─ Service
│     │  │           │  ├─ BackStageService.java
│     │  │           │  └─ VoiceService.java
│     │  │           └─ View
│     │  │              ├─ Home
│     │  │              │  ├─ HomeFragment.java
│     │  │              │  └─ HomeView.java
│     │  │              └─ User
│     │  │                 ├─ LoginView.java
│     │  │                 ├─ RegisterView.java
│     │  │                 └─ UserFragment.java
│     │  └─ res
│     │     ├─ drawable
│     │     │  ├─ ic_home_home.xml
│     │     │  ├─ ic_home_user.xml
│     │     │  ├─ ic_launcher_background.xml
│     │     │  ├─ ic_login_account.xml
│     │     │  ├─ ic_login_back.xml
│     │     │  └─ ic_login_password.xml
│     │     ├─ drawable-nodpi
│     │     │  └─ pic_login_bg.webp
│     │     ├─ drawable-v24
│     │     │  └─ ic_launcher_foreground.xml
│     │     ├─ layout
│     │     │  ├─ fragment_home.xml
│     │     │  ├─ fragment_user.xml
│     │     │  ├─ home.xml
│     │     │  ├─ login.xml
│     │     │  └─ register.xml
│     │     ├─ layout-land
│     │     ├─ menu
│     │     │  └─ bottom_navigation_items.xml
│     │     ├─ mipmap-anydpi-v26
│     │     │  ├─ ic_launcher.xml
│     │     │  └─ ic_launcher_round.xml
│     │     ├─ mipmap-hdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-mdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xxhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xxxhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ values
│     │     │  ├─ colors.xml
│     │     │  ├─ dimens.xml
│     │     │  ├─ strings.xml
│     │     │  └─ themes.xml
│     │     ├─ values-night
│     │     │  └─ themes.xml
│     │     └─ xml
│     │        ├─ backup_rules.xml
│     │        └─ data_extraction_rules.xml
│     └─ test
│        └─ java
│           └─ com
│              └─ example
│                 └─ voiceassistant
│                    └─ ExampleUnitTest.java
├─ gradle
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradle.properties
├─ gradlew
├─ gradlew.bat
└─ README.md

```
```
VoiceAssistant
├─ .git
│  ├─ COMMIT_EDITMSG
│  ├─ config
│  ├─ description
│  ├─ FETCH_HEAD
│  ├─ fsmonitor--daemon
│  │  └─ cookies
│  ├─ HEAD
│  ├─ hooks
│  │  ├─ applypatch-msg.sample
│  │  ├─ commit-msg.sample
│  │  ├─ fsmonitor-watchman.sample
│  │  ├─ post-update.sample
│  │  ├─ pre-applypatch.sample
│  │  ├─ pre-commit.sample
│  │  ├─ pre-merge-commit.sample
│  │  ├─ pre-push.sample
│  │  ├─ pre-rebase.sample
│  │  ├─ pre-receive.sample
│  │  ├─ prepare-commit-msg.sample
│  │  ├─ push-to-checkout.sample
│  │  └─ update.sample
│  ├─ index
│  ├─ info
│  │  └─ exclude
│  ├─ logs
│  │  ├─ HEAD
│  │  └─ refs
│  │     ├─ heads
│  │     │  └─ main
│  │     └─ remotes
│  │        └─ vafe
│  │           └─ main
│  ├─ objects
│  │  ├─ 00
│  │  │  └─ bd82538aa897f076d3f310962ec2a4b055aeaf
│  │  ├─ 01
│  │  │  └─ 40f12e547bdc38e06ae9913f9b05e4adc7af50
│  │  ├─ 07
│  │  │  ├─ 615786dd22a6c2df1ebd0b3a53fcd204d49d6c
│  │  │  └─ d5da9cbf141911847041df5d7b87f0dd5ef9d4
│  │  ├─ 0c
│  │  │  └─ bb98f1fc4bf2a28561c244a76a07b5e937432b
│  │  ├─ 10
│  │  │  └─ 7acd32c4e687021ef32db511e8a206129b88ec
│  │  ├─ 11
│  │  │  └─ b3dee6370ac0c089d38c5315941a6b094051c2
│  │  ├─ 12
│  │  │  ├─ 17e928894cecf247fd980964e5e9f7fad16e4e
│  │  │  ├─ 96b21c55a8699fa771307172b610273e8c1d8b
│  │  │  └─ d9f206c31e04a16ef12088d7964c2483e25d9f
│  │  ├─ 13
│  │  │  ├─ 27327f89aa9bc67d0d4dbcbd0c6ca148ef1f9a
│  │  │  └─ c5314b75eda8380f97a89043da7a32d54eb64b
│  │  ├─ 14
│  │  │  └─ 6812fb1fe5307ffcd4ba94e4cfe6970a7e3593
│  │  ├─ 16
│  │  │  └─ a8cb8890e3e6dd29b0eec3d9b0f5352f16f7a3
│  │  ├─ 17
│  │  │  └─ 5d580461953b348e245edef0dfbbf00d9e2f8e
│  │  ├─ 19
│  │  │  ├─ 60d09b60c6908233936fbe4d5be23ba60aaa8a
│  │  │  └─ fefdf2f8f3c16099d8262035f0750f8cac7c62
│  │  ├─ 1a
│  │  │  └─ ad606672fda0f0dc3fc76021e618f52df3ab41
│  │  ├─ 1b
│  │  │  ├─ 6521448a24683695be8d2958db6dd7529d495e
│  │  │  ├─ 9a6956b3acdc11f40ce2bb3f6efbd845cc243f
│  │  │  └─ f33d0e6f460c30413b1dc196b4251b64b2eb58
│  │  ├─ 1c
│  │  │  └─ 6804d66822e8ca796332785e3a7904b4c728ab
│  │  ├─ 1e
│  │  │  └─ e5f35ffaac608a16ea9cb163f1036b33ac3c82
│  │  ├─ 1f
│  │  │  └─ 719381a90ad177fb300335857e962e166db1a1
│  │  ├─ 21
│  │  │  └─ 9a2d202f75e988837df6e852ec6f1764ca2177
│  │  ├─ 22
│  │  │  └─ 75b6413c5f25fbabc8ba5b9e063aa1bc30b982
│  │  ├─ 23
│  │  │  └─ 7ef9c9bd65bc6660a477f3ec4bb07e9d7c8977
│  │  ├─ 24
│  │  │  └─ 3f056ee39284d1f55d4e8da3dce6d8affe1295
│  │  ├─ 25
│  │  │  └─ ddfd0312b8c12a60a099a71c605531a4800436
│  │  ├─ 27
│  │  │  └─ c2bf5866bcb092a4c32865102d1da37c0a9b68
│  │  ├─ 28
│  │  │  └─ d4b77f9f036a47549d47db79c16788749dca10
│  │  ├─ 2b
│  │  │  └─ 068d11462a4b96669193de13a711a3a36220a0
│  │  ├─ 2f
│  │  │  ├─ 327f4eea0cc1a140b14f20e1968339b4f1f61e
│  │  │  ├─ 6f49daf8483b153a5a11ae8321bff2f7f74d6b
│  │  │  └─ e521cf3507fda5b3325621d10953cdb1982f51
│  │  ├─ 31
│  │  │  └─ e7d4a32f55aba9efd136db4af4ac0ad1ddcdf4
│  │  ├─ 35
│  │  │  └─ 9bb5307e8535ab7d59faf27a7377033291821e
│  │  ├─ 36
│  │  │  └─ 7ba088b6478dcb253a9cd179f2a8f21264cf23
│  │  ├─ 38
│  │  │  └─ ffcd024691f78fc0e4ebff2afdb362cf1bef58
│  │  ├─ 3d
│  │  │  └─ aed1d8292ff5febafe3ac95c9bc1b354958196
│  │  ├─ 41
│  │  │  └─ 1417839dca4523670fca254f02b0ae448aa51f
│  │  ├─ 42
│  │  │  ├─ 022c214b8c47a5d5f9774197529f763d5716a0
│  │  │  └─ afabfd2abebf31384ca7797186a27a4b7dbee8
│  │  ├─ 44
│  │  │  └─ 2c769043d7491f43f35d3e85afc45561bba3ed
│  │  ├─ 46
│  │  │  └─ 123c8a05f7c8ae0d069692786b4f3b1a0648d7
│  │  ├─ 48
│  │  │  └─ 1bb434814107eb79d7a30b676d344b0df2f8ce
│  │  ├─ 4e
│  │  │  └─ 9039d72650c21335f95e2c2243a04d72270cee
│  │  ├─ 4f
│  │  │  ├─ 0f1d64e58ba64d180ce43ee13bf9a17835fbca
│  │  │  └─ 906e0c811fc9e230eb44819f509cd0627f2600
│  │  ├─ 55
│  │  │  └─ 11dc4162c97453a1d0494ff94402d4b0146579
│  │  ├─ 58
│  │  │  └─ 82c5e7e3a33032560b4bf3dee8438d683bbc89
│  │  ├─ 59
│  │  │  ├─ 2c261760ae3ae6d451e17b2a3de4e78335f6c7
│  │  │  └─ a02a1d8fea67e0f2591ebf6f644c1b979a4ef6
│  │  ├─ 5a
│  │  │  └─ 870f557b451949c3c80f22d8c6224533f51a60
│  │  ├─ 5c
│  │  │  └─ fcc7ae084608c8b8e6f2c18d6a9c6e4c4f5317
│  │  ├─ 61
│  │  │  ├─ 209b6b58bd14ecb4a0fffa1efaa697b5614eb7
│  │  │  └─ 8cfb988c62fdafca09ee4cf6c136768eb3f48b
│  │  ├─ 62
│  │  │  └─ b611da081676d42f6c3f78a2c91e7bcedddedb
│  │  ├─ 64
│  │  │  └─ 6720096ef0b50f7334f283996101c7b5b3e5da
│  │  ├─ 6a
│  │  │  └─ 1c1c26a4ab1a3a8580622836a3fcb5aa53ee0c
│  │  ├─ 6c
│  │  │  └─ cd5bfbd48698ba04f6b95d609f364d336c4c10
│  │  ├─ 6e
│  │  │  └─ a3b944de763785c89b2822b778aa6e584ce2ae
│  │  ├─ 6f
│  │  │  ├─ 3b755bf50c6b03d8714a9c6184705e6a08389f
│  │  │  └─ 64523b5fe4d0ced56ab514740fa50c6cc6d1c7
│  │  ├─ 70
│  │  │  └─ 95c434f8119e58167a89faaa832164f8473a2c
│  │  ├─ 78
│  │  │  └─ f0ddbb45a6d0893ad973b8820ec9c5b9907fb3
│  │  ├─ 7b
│  │  │  ├─ b0cecb15e354e11d782f41607e57b681d7ed1f
│  │  │  └─ ee6b70895e0fec0ddcb2d9a211409c7288eaba
│  │  ├─ 7f
│  │  │  └─ 6692504724d3819dc2e8fee2ca5ce62d9f29e6
│  │  ├─ 82
│  │  │  └─ 77ee4530a18e7d0445a82951c51b6117f7beb2
│  │  ├─ 84
│  │  │  ├─ 1f3effcc75352bc5733ba5e9168424bd9b2b30
│  │  │  ├─ 35d73166dddd2edaf03b8060757eb9a81027bd
│  │  │  └─ 52791cfd2d974df68bfdf74dfa9bc0f4d353b1
│  │  ├─ 89
│  │  │  └─ 4cd1d5cd4c69efb022798b675a6bb330eb5bdf
│  │  ├─ 8a
│  │  │  └─ 4470d9f3fbf4f63655ded86420047dd2ee1a56
│  │  ├─ 8b
│  │  │  └─ 83b271a9d83dedd52babc828ee64c60337759f
│  │  ├─ 8d
│  │  │  └─ 2e381df87cdabbb531670d9c9c8793f125e7b3
│  │  ├─ 8e
│  │  │  ├─ c04b45e31cdcd6e2c040b1a9bd0d0489155c3c
│  │  │  └─ e6c3f79a7169702892c585098b0981b72a5184
│  │  ├─ 91
│  │  │  ├─ 26ae37cbc3587421d6889eadd1d91fbf1994d4
│  │  │  └─ 506cbc2d89b7f0497c413399c2aec4d6db291a
│  │  ├─ 92
│  │  │  └─ 87f5083623b375139afb391af71cc533a7dd37
│  │  ├─ 93
│  │  │  └─ 527e2fd37bfd6bb01f2f20d86ff4e4c4a06d2f
│  │  ├─ 94
│  │  │  ├─ 8a3070fe34c611c42c0d3ad3013a0dce358be0
│  │  │  ├─ a25f7f4cb416c083d265558da75d457237d671
│  │  │  └─ f477125ed63bafdab08c9520cc700ec726b836
│  │  ├─ 96
│  │  │  ├─ 0f0a4cb6806bd49607581251acd387813f5b6c
│  │  │  └─ 61d3fa820b4b71022bdff509288e2c3ef5733f
│  │  ├─ 97
│  │  │  └─ c3cc83f2e0b7e53fff8e3c11c10ca82c635b55
│  │  ├─ 9b
│  │  │  └─ 44378bd2da1f0cc324449bd2bfe48afa20c886
│  │  ├─ 9e
│  │  │  └─ e9997b0b4726e57c27b2f7b21462b604ff8a88
│  │  ├─ a3
│  │  │  ├─ 9c1b376872c0267a78c1d3c0ee701b40b01e24
│  │  │  └─ de34961096076e3ad578310142d8e33859d1bb
│  │  ├─ a5
│  │  │  ├─ 6cedac79297d90cc56d1483b939806b921859d
│  │  │  └─ fa8766a7e632ab5a0e03ff688be7246a3e007f
│  │  ├─ a9
│  │  │  └─ 6765479463590359786eb644dadb3b9c2b559e
│  │  ├─ aa
│  │  │  ├─ 724b77071afcbd9bb398053e05adaf7ac9405a
│  │  │  ├─ 7d6427e6fa1074b79ccd52ef67ac15c5637e85
│  │  │  └─ cedaecf598e58c07ef4c16ac7042dc0b233711
│  │  ├─ ab
│  │  │  └─ 55130571f977ffdd88b9c4abbf83ce79e819b4
│  │  ├─ b2
│  │  │  └─ dfe3d1ba5cf3ee31b3ecc1ced89044a1f3b7a9
│  │  ├─ b5
│  │  │  ├─ 89d56e9f285d8cfdc6c270853a5d439021a278
│  │  │  └─ f3b2374c8469c0789e5419af77429310547865
│  │  ├─ b6
│  │  │  └─ 346aed29991f9dca4477a304c9f71db8821ddd
│  │  ├─ b9
│  │  │  └─ 9a7826e9cc7447e546d25372a2dcdbca8a7ade
│  │  ├─ bb
│  │  │  └─ 70b86885095a0aa1f2a018a7de28cb73c765b9
│  │  ├─ be
│  │  │  └─ 1e76d81b96207aa84ac9dbca82937a34ac9e55
│  │  ├─ c0
│  │  │  └─ 33b6b2e70a2d6993c415f583601bc6745f63fb
│  │  ├─ c1
│  │  │  └─ 1be6a69bbaf6b5fccea62a01224dd8aec69116
│  │  ├─ c2
│  │  │  └─ 09e78ecd372343283f4157dcfd918ec5165bb3
│  │  ├─ c3
│  │  │  └─ 36f6e419d0095b50718aee4924a64edb22a114
│  │  ├─ c4
│  │  │  └─ c2fab631fe4ea00e8236ccf0d13c735175e46a
│  │  ├─ cf
│  │  │  ├─ 535190e36ea1bb0c50b5e9f2f206bed5d26f17
│  │  │  └─ f0325213520f31fb713b436949e0a3e7a78abd
│  │  ├─ d1
│  │  │  └─ d68490aa6286f611b45e96a598aa9b56b82f4a
│  │  ├─ d2
│  │  │  └─ a8b93f8415cb6ef9ffda94a7e5b9ec20a0a164
│  │  ├─ d5
│  │  │  └─ 9562bde490f0ef2bf56d0aaa97cb12cac267dd
│  │  ├─ d6
│  │  │  └─ ccb3099378f33a8541d913612d803362b5f2b4
│  │  ├─ d9
│  │  │  └─ a3315dbc2a0ba72eb5e2de32cf4f782be5bf13
│  │  ├─ df
│  │  │  └─ 5a24a8292477cdde4b6dce7af3de456b8d5ad4
│  │  ├─ e0
│  │  │  ├─ 0409856adb3367d0008db1b4b8a0b18fac4f99
│  │  │  └─ ad76afef0116c86435202e045eb5a8aa56a0c6
│  │  ├─ e2
│  │  │  └─ 26f42e909c055902cbf069839b176ada049558
│  │  ├─ e7
│  │  │  └─ 08b1c023ec8b20f512888fe07c5bd3ff77bb8f
│  │  ├─ eb
│  │  │  └─ 287923d8a985986afa4e255917c62fcfe8a6f9
│  │  ├─ ee
│  │  │  └─ 5502e6ebc8a4abdc0ee42e0846ee7e606f9016
│  │  ├─ ef
│  │  │  └─ 43123ac39145e57a18c4dfba44b5f842d5c309
│  │  ├─ f0
│  │  │  ├─ 0c4db5dd3006555ee378f1e3994a36c16c60c3
│  │  │  ├─ 1eec376fb3b06999b3e3ce71f6461416f4bff1
│  │  │  └─ c49846ff176634892b2cb0855b15c41a0aa5ee
│  │  ├─ fa
│  │  │  ├─ 0f996d2c2a6bdd11f5371de4268c8389d6c720
│  │  │  └─ 15bdce2a7c25cb409a9a1e5269a65453fb4805
│  │  ├─ fe
│  │  │  └─ 15cb61a60cd86a9399aa26187c696a5f37f73e
│  │  ├─ info
│  │  └─ pack
│  └─ refs
│     ├─ heads
│     │  └─ main
│     ├─ remotes
│     │  └─ vafe
│     │     └─ main
│     └─ tags
├─ .gitignore
├─ .idea
│  ├─ .gitignore
│  ├─ checkstyle-idea.xml
│  ├─ compiler.xml
│  ├─ gradle.xml
│  ├─ misc.xml
│  └─ vcs.xml
├─ app
│  ├─ .gitignore
│  ├─ libs
│  ├─ proguard-rules.pro
│  └─ src
│     ├─ androidTest
│     │  └─ java
│     │     └─ com
│     │        └─ example
│     │           └─ voiceassistant
│     │              └─ ExampleInstrumentedTest.java
│     ├─ main
│     │  ├─ AndroidManifest.xml
│     │  ├─ icons
│     │  │  ├─ login.svg
│     │  │  └─ password.svg
│     │  ├─ java
│     │  │  └─ com
│     │  │     └─ example
│     │  │        └─ voiceassistant
│     │  │           ├─ API
│     │  │           │  ├─ APIManager.java
│     │  │           │  └─ AuthAPI.java
│     │  │           ├─ Entity
│     │  │           │  ├─ Request
│     │  │           │  │  └─ UserAuthenticationRequest.java
│     │  │           │  └─ Response
│     │  │           │     └─ UserAuthenticationResponse.java
│     │  │           ├─ Public
│     │  │           ├─ Router
│     │  │           ├─ Service
│     │  │           │  ├─ BackStageService.java
│     │  │           │  └─ VoiceService.java
│     │  │           └─ View
│     │  │              ├─ Home
│     │  │              │  ├─ HomeFragment.java
│     │  │              │  └─ HomeView.java
│     │  │              └─ User
│     │  │                 ├─ LoginView.java
│     │  │                 ├─ RegisterView.java
│     │  │                 └─ UserFragment.java
│     │  └─ res
│     │     ├─ drawable
│     │     │  ├─ ic_home_home.xml
│     │     │  ├─ ic_home_user.xml
│     │     │  ├─ ic_launcher_background.xml
│     │     │  ├─ ic_login_account.xml
│     │     │  ├─ ic_login_back.xml
│     │     │  └─ ic_login_password.xml
│     │     ├─ drawable-nodpi
│     │     │  └─ pic_login_bg.webp
│     │     ├─ drawable-v24
│     │     │  └─ ic_launcher_foreground.xml
│     │     ├─ layout
│     │     │  ├─ fragment_home.xml
│     │     │  ├─ fragment_user.xml
│     │     │  ├─ home.xml
│     │     │  ├─ login.xml
│     │     │  └─ register.xml
│     │     ├─ layout-land
│     │     ├─ menu
│     │     │  └─ bottom_navigation_items.xml
│     │     ├─ mipmap-anydpi-v26
│     │     │  ├─ ic_launcher.xml
│     │     │  └─ ic_launcher_round.xml
│     │     ├─ mipmap-hdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-mdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xxhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ mipmap-xxxhdpi
│     │     │  ├─ ic_launcher.webp
│     │     │  └─ ic_launcher_round.webp
│     │     ├─ values
│     │     │  ├─ colors.xml
│     │     │  ├─ dimens.xml
│     │     │  ├─ strings.xml
│     │     │  └─ themes.xml
│     │     ├─ values-night
│     │     │  └─ themes.xml
│     │     └─ xml
│     │        ├─ backup_rules.xml
│     │        └─ data_extraction_rules.xml
│     └─ test
│        └─ java
│           └─ com
│              └─ example
│                 └─ voiceassistant
│                    └─ ExampleUnitTest.java
├─ gradle
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradle.properties
├─ gradlew
├─ gradlew.bat
└─ README.md

```