# demo-base

## 目录结构
- **`src.main.java`** : 项目代码
- **`src.main.resources`** : 项目资源文件
- **`src.test.java`** : 测试代码
- `pom.xml` : 本模块pom
- `README.md` : 说明

### pom.xml
- `parent` : 父pom : `com.demo:demo-parent`
- `dependencies` : 依赖
- `build` : 构建插件

### src.main.java.com.demo
- **`base`** : 基类文件夹
  - `MongoEntityBase` : Mongo实体层基类
  - `ToStringBase` : ToString格式化基类
- **`config`** : 配置文件夹
  - `HttpMessageConvertersConfig` : 消息转换器配置类
  - `MongoDbConfig` : MongoDB配置
  - `TomcatConfig` : Tomcat配置类
- **`constant`** : 常数文件夹
  - `ResultCodeEnum` : 返回结果状态枚举类
- **`controller`** : 控制层文件夹
  - `UserMongoController` : 首页
- **`dao`** : 数据访问层文件夹
  - **`mongo`** : mongo的Dao层文件夹
    - `UserMongoDao` : 用户MongoDao
- **`entity`** : 实体层文件夹
  - **`mongo`** : 数据库实体层
    - `UserMongo` : 用户Mongo
  - **`pojo`** : 普通实体层
    - `Result` : 返回结果实体类
- **`handler`** : 处理层文件夹
  - `GlobalExceptionHandler` : 全局异常处理类(404异常除外)
  - `NotFoundExceptionHandler` : 404异常处理类
- **`repo`** : MongoJPA操作
  - `UserMongoRepo` : 用户MongoRepo
- **`service`** : 服务层
  - `UserMongoService` : 用户Mongo服务
- `DemoMongoDbApp` : 启动类

### src.main.resources
- **`config`** : 配置文件
  - `application.yml` : 总配置
  - `application-dev.yml` : 开发环境配置
  - `application-prd.yml` : 生产环境配置
  - `application-qas.yml` : 测试环境配置
- **`static`** : 静态文件
  - `favicon.ico` : 图标
- `404z.cn.jks` : ssl证书
- `banner.txt` : 横幅

#### application.yml
- `spring.profiles.active` : 使用的配置文件后缀
- `spring.servlet.multipart` : 传输文件
  - `max-file-size` : 最大文件大小
  - `max-request-size` : 最大请求大小
- `spring.data.mongodb` : mongodb配置
  - `auto-index-creation` : 是否自动创建索引
- `server.compression.enable` : 是否启用响应压缩
- `server.servlet.content-path` : 前缀(例如/api)
- `server.port` : 端口号
- `server.ssl` : ssl证书
  - `key-store` : 路径(例如classpath:404z.cn.jks)
  - `key-store-password` : 密码
  - `key-store-type` : 类型
- `logging.file.name` : 日志文件(可带路径)

#### application-xxx.yml
- `spring.devtools.restart.enabled` : 启用热部署
- `spring.data.mongodb` : mongodb配置
  - `uri` : 地址(例如mongodb://localhost:27017/demo)
- `logging.level.root` : 记录日志等级，值如下
  - `trace` : 跟踪
  - `debug` : 调试
  - `info` : 信息
  - `warn` : 警告
  - `error` : 错误
  - `fatal` : 致命
  - `off` : 关闭

### src.test.java.com.demo
- `AppTest` : 启动类测试
