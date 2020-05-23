package com.qyh.tpsofbd.common.exception;

/**
 * 系统异常码划分规则:
 * 系统管理：101+2位子模块号+4位序号，例如：101010001
 * 资源管理：102+2位子模块号+4位序号，例如：102010001
 * 安全管理：104+2位子模块号+4位序号，例如：104010001
 *
 * @author yt.wei date 2018/3/29 10:07
 * @version 0.1
 */
public enum ErrorCodeEnum {

    //异常码作用:不对外暴露异常信息
    // 平台通用异常码以10000开头
    SYS_ERROR("100000000", "系统错误"),
    SYS_DB_OPER_ERROR("100000001", "数据库操作失败"),
    SYS_PARAM_NULL("100000002", "关键参数为空"),
    UNKNOWN_ERROR("100000003", "未知错误,请联系管理员"),
    OPERATOR_ERROR("100000004", "对象操作异常"),
    TOKEN_ERROR("100000005", "认证信息验证失败"),
    SERVICE_NOT_STARTED("100000006", "调用服务未启动"),
    JOB_NOT_STARTED("100000007", "定时任务服务未启动"),
    ERROR_ES_PARAM("100000008", "ES操作语法错误"),
    ERROR_DATE_FORMAT("100000009", "日期或时间格式不支持,请重新输入"),
    // 平台通用异常码end

    // 全局配置以10102开头
    SYS_GLOBAL_CONFIG_ID_NULL("101020001", "全局配置ID为空"),
    // 全局配置end

    /*
     * cmdb mudule error code code format : 102XXXXXX
     *
     * @author xg.zhao 2018/6/27 11:35
     */
    TOPOLOGY_IS_EXIST("102010000", "拓扑分层已经存在"),
    SOFTWARE_IS_EXIST("102010001", "软件已经存在"),
    PROVIDER_IS_EXIST("102010002", "供应商已经存在"),
    OS_IS_EXIST("102010003", "操作系统已经存在"),
    VERIFY_CONSTRAIN_FAIL("102010004", "约束名称已经存在"),
    VERIFY_CONSTRAIN_ISUSE_FAIL("102010025", "约束规则已经存在"),
    FILE_NOT_FOUND("102010005", "未找到相关文件"),
    SAVE_FILE_ERROR("102010006", "保存文件失败"),
    ERROR_INSERT_CI("102010007", "新增配置项失败"),
    ERROR_CI_RELATION("102010008", "该配置项关系不存在"),
    VERIFY_DATE_ERROR("102010008", "时间格式不正确"),
    STATUS_IS_ALREADY_USE("102010009", "当前状态已被使用"),
    UPDATE_CITYPE_ERROR("102010010", "已经有子配置项，类型不能修改"),
    DELETE_DEF_CIATTR("102010011", "默认配置项属性无法删除"),
    CI_INSTANCE_IS_EXIST("102010012", "当前配置项已经存在实例,不能操作配置项属性"),
    TOPOLOGY_IS_CI_USE("102010013", "当前拓扑分层已被配置项使用,不可以删除."),
    UPDATE_CITYPE_EIXT_ERROR("102010014", "当前配置项存在实例，不能修改类型"),
    APP_RES_TYPE_NOT_FOUND("102010015", "方式资源单类型不存在"),
    APPSYS_ADDRES_ERROR("102010016", "应用系统新增资源失败"),
    APPSYS_ADDRESCHANGE_ERROR("102010017", "应用系统新增变更记录失败"),
    APPSYS_NO_RES_ADD("102010018", "当前没有新增资源,不能生成扩容方式资源单"),
    APPSYS_NO_RES_CHANGE("102010019", "当前系统没有资源变更,不能生成部署实施方式资源单"),
    DELETE_DEF_FAILED("102010020", "预置数据无法删除."),
    CI_RELATION_ISEXIST("102010021", "当前配置项关系下有实例引用"),
    PROVIDER_USER_OS("102010022", "已经有操作系统属于该厂商"),
    PROVIDER_USER_SOFTWARE("102010023", "已经有软件属于该厂商"),
    RESPOOL_HAS_CLUSTER("102010024", "删除失败，资源池下有集群"),
    ATTR_COL_ISUSE("102010026", "删除失败，全局属性已经被配置项引用"),
    RELATION_ISUSE("102010027", "删除失败，全局关系已经被配置项引用"),
    RELATION_NOTISCLASS("102010028", "类型为分类的配置项不能创建关系"),
    UPDATE_OBJ_ISNULL("102010029", "被编辑对象不存在"),
    ERROR_INSERT_SYSCODE("102010030", "编码已存在"),
    ERROR_INSERT_NAME("102010031", "名称已存在"),
    DELETE_DEFSTATUS_FAILED("102010032", "预置状态无法删除."),
    DELETE_DEFREL_FAILED("102010033", "所选项包含预置关系无法删除"),
    UPDATE_DEFREL_FAILED("102010034", "预置配置项关系无法编辑."),
    DELETE_DEFREL_CATAGORY("102010035", "包含正在使用字典分类,请禁用后删除"),
    DELETE_DEFREL_SYS_CODE("102010036", "字典分类下有内容正在使用,无法删除"),
    DELETE_DEFREL_SYSCODE("102010037", "包含正在使用字典内容,请禁用后删除"),
    DELETE_OBJ_ISNULL("102010038", "操作对象不存在,请刷新后重试"),
    PRICE_NAME_EXIST("102010039", "名称已存在,请更换"),
    CONTAINS_INITIALIZE_DATA("102010040", "包含预置数据无法删除."),
    ERROR_TEMPLATE("102010041","资源数据格式不匹配,请使用最新的模板"),
    DELETE_SINGLE_SYSCODE("102010042", "字典内容正在使用,请禁用后删除"),
    DELETE_SINGLE_CATAGORY("102010043", "字典分类正在使用,请禁用后删除"),
    VM_MUST_HAS_RESPOOL("102010044","虚拟机需要指定资源池"),
    VERIFY_INSTSTATUS_NAME("102010045", "当前配置项状态已经存在"),
    AUDIT_RESOURCE_NOTFOUND("102010046","没有找到待审核资源信息"),
    /*
     * message mudule error code code format : 103XXXXXX
     *
     * @author xg.zhao 2018/6/27 11:35
     */
    RESET_PASS_SEND_ERROR("103010001", "重置密码发送消息失败"),
    USER_NO_EMAIL_ACCOUNT("103010002", "用户无法收到新密码,请先完善邮箱信息"),
    EMAIL_VERIFY_ERR("103010003", "邮箱信息格式不正确,请先完善邮箱信息"),

    /*
     * automation mudule error code code format : 105XXXXXX
     *
     * @author xg.zhao 2018/6/27 11:35
     */
    ERROR_VERIFY_SCRIPT("105010001", "自动化任务脚本不能为空"),
    ERROR_AUTO_OWNER("105010002", "自动化负责人不能为空"),
    ERROR_AUTO_RES("105010003", "自动化任务不能没有执行目标资源"),
    ERROR_AUTO_NAME("105010004", "自动化任务的名称只能由中文,字母,数字和下划线组成,必须以中文或字母开头"),
    ERROR_AUTO_NAME_LEN("105010005", "自动化任务的名称过长,名称最多只能输入20个字符"),
    ERROR_AUTO_DES_LEN("105010006", "自动化任务的描述过长,描述最多只能输入100个字符"),
    ERROR_AUTO_EXEPLAN("105010007", "执行计划格式不正确,应满足cron表达式格式"),
    ERROR_AUTO_NAME_EXIST("105010008", "自动化任务名称已经存在"),
    ERROR_AUTO_TASK_EXIST("105010009", "自动化任务不存在"),
    ERROR_AUTO_TASK_RUNING("105010010", "自动化任务正在运行,无法删除"),
    ERROR_AUTO_TASK_RUN("105010011", "自动化任务正在执行中,不能被操作"),
    NOTFOUNT_AUTO_TASK("105010012", "未找到该的自动化任务信息"),
    ERROR_AUTO_RUN_TASK("105010013", "任务执行出错"),
    MODIFY_DEF_FAILED("102010021", "预置数据无法修改."),
    GET_LDAPCONFIG_ERR("104010001", "获取ldap配置失败"),
    LDAPCONFIG_ERROR("104010002", "ldap配置不正确"),

    /*
     * 功能描述:  106xxxxxx
     * @author sj.yan
     * @date 2018/10/31 0031 下午 4:31
     */
    PM_ENV_EXSIT_INSTANCE("106010001", "环境下有资源,删除失败"),
    ENV_INS_EXSIT("106010002", "资源关系已经存在,请刷新后重试"),
    PM_NOT_EXSIST("106010003", "环境不存在或已删除,请刷新后重试"),

    /**
     * * 参数错误：100001-199999
     * */
    ERROR_PIC_FILE("100001", "非法数据"),
    ERROR_IP_MASK_FILE("100002", "子网掩码不支持"),
    ERROR_GATE_WAY_FILE("100003", "网关地址错误"),
    ERROR_ADD_FAST_FILE("100005", "名称已存在，请勿重复提交"),
    ERROR_VLAN_FILE("100004", "该网段中ip重复错误"),
    ERROR_VLAN_NOT_EXSIT("100006", "网段不存在或已被删除,请刷新后重试"),
    ERROR_VLAN_STOP_USE("100007", "所在网段已经停用,该ip无法编辑"),
    ERROR_OS_CONNECTION("100008", "正在连接中，不能操作"),
    ERROR_OS_SYNC("100009", "正在同步中，不能操作"),
    ERROR_OS_NOT_EXSIT("100010", "管理域不存在或已被删除,请刷新后重试"),
    ERROR_IP_IN_USED("100011", "当前IP已在使用中"),
    ERROR_OSS_STATUS("100012", "以下管理域目前无法同步，请检查状态"),
    /***
     * ** 校验错误: 110000 - 119999
     * */
    VERIFY_FAIL("115000", "数据校验失败"),
    PARAM_NULL_OR_LONG("110001", "参数为空或长度超出限制"),
    PARAM_NOT_EMAIL("110002", "邮箱格式不正确或太长"),
    PARAM_NOT_PHONE("110003", "号码格式不正确"),
    PARAM_NEED_ONE("110004", "密码或TOKEN均为空"),
    PARAM_NOT_IP("110005", "IP地址不正确"),
    PARAM_NOT_PORT("110006", "端口号不正确"),
    PARAM_TOO_LONG("110007", "参数长度超出限制"),
    RES_APP_ERROR("400003", "生成资源单失败."),
    RES_APP_ISNEWEST("400004", "已经是最新资源单."),

    /*
     * 用户错误：200001-299999
     */
    ERROR_RECORD_NOT_FOUND("200001", "没有找到对应的数据"),
    SYS_ADMIN_DELETE("200002", "内置管理员账号无法删除"),
     //数据错误：300001-399999
    ERROR_SEARCH_FAILED("300001", "查询失败"),
    ERROR_COUNT_FAILED("300002", "查询数据总数失败"),
    DELETE_ATTR_FAILED("310005", "删除失败,当前属性被配置项引用."),
    NOTSELECT_INSTHIS("310010","查询不到历史记录"),

    /**
     * 系统分类操作失败信息
     */
    WARN_DELETE_SYS_CODE("310004", "删除失败,当前系统分类下有系统属性"),
    /**
     * 系统属性失败信息
     */
    ERROR_INSERT_SYS_CODE("310000", "新增系统属性失败"),
    ERROR_SELECT_SYS_CODE("310001", "获取数据失败"),
    ERROR_DELETE_SYS_CODE("310002", "删除系统属性失败"),
    ERROR_UPDATE_SYS_CODE("310003", "更新系统属性失败"),
    ERROR_OLD_PASSWORD("310004", "旧密码不正确"),
    ERROR_NO_USER("310005", "用户不存在"),
    VERIFY_RESULT("390000", "当前分类下有属性"),

    //业务错误：400001-499999
    ERROR_DB_METHOD("400001", "数据库操作错误"),
    ERROR_INVALID_ARGUMENT("400002", "参数不合法"),
    ERROR_DATA_OCCUPANCY("400003", "数据被占用"),
    ERROR_UNIQUE_CONSTRAINT("400004", "违反唯一约束条件"),
    ERROR_DELETE_ATTRIBUTE("400005", "配置项存在实例不可删除属性"),
    ERROR_TABLE_NOT_EXIST("400006", "数据库表不存在"),
    ERROR_RELATION_EXIST("400008", "关系已存在"),
    ERROR_NOT_EXIST("400009", "数据不存在"),
    ERROR_NAME_EXIST("400010", "名称已经存在"),
    ERROR_CODE_EXIST("400011", "标签编码或名称已经存在"),
    ERROR_CI_TYPE_INSERT("400012", "配置项为分类,无法创建实例"),
    ERROR_RELATION_EXIST_CI("400013", "关系已经存在"),
    ERROR_VERSION("400014", "版本号不能为空"),
    ERROR_UPLOAD("401000", "文件上传失败"),
    ERROR_OWNER_DELETED("401011", "文件所属目标已经被删除，上传失败"),
    ERROR_MAKE_DIR("401005", "文件目录创建失败"),
    SUCCESS_UPLOAD("401001", "文件上传成功"),
    ERROR_DOWNLOAD("401002", "文件下载失败"),
    ERROR_DELETE_FILE("401003", "文件删除失败"),
    ERROR_UPLOAD_FILE("401004", "文件不能为空"),
    ERROR_UPLOAD_MAX_SIZE_FILE("401005", "文件最大不能超过1M"),
    ERROR_UPLOAD_FORMATTE_FILE("401006", "文件只能为yml，zip，rar文件"),
    CONNECT_FTP_ERROR("401007", "FTP服务器连接失败，请检查配置信息"),
    CONNECT_FTP_REFUSED("401008", "FTP服务器拒绝连接"),
    FTP_LOGIN_ERR("401009", "FTP服务器登录失败,请检查用户名和密码"),
    MAIL_SERVER_TIMEOUT("401010", "邮件服务器连接超时"),
    ERROR_INSERT("400101", "数据插入失败"),
    ERROR_UPDATE("400102", "数据更新失败"),
    ERROR_DELETE("400103", "数据删除失败"),
    ERROR_SELECT("400104", "数据查询失败"),
    ERROR_INSET_GROUP("400105", "属性组已经存在"),
    ERROR_EXCEED_RESOURCE_RELATION("402000", "同类型资源关系已存在"),
    ERROR_SYNC_ALREADY("403000", "同步正在进行中"),
    ERROR_CONNECT_FAIL("403001", "连接服务器失败"),
    ERROR_INSET_OSS_IP("403002", "IP地址已经存在"),
    ERROR_ROLE_HAS_USER("403003", "该角色已经关联用户,不允许删除"),
    ERROR_SYNC_NO_OSS("403004", "管理域不存在，不能进行同步"),
    ERROR_INSET_OSS_NAME("403005", "管理域名称已经被使用"),
    ERROR_INSET_STATUS("403006", "状态不存在，请刷新后重试"),
    ERROR_INSET_NOT_EXSIT("403007", "服务器不存在或已被删除,请刷新后重试"),
    ERROR_FTP_CONNECT_FAIL("403008", "无法连接FTP服务器，请检查FTP配置或网络"),
    ERROR_FTP_RENAME("403009", "重命名FTP文件失败"),
    ERROR_OSID_NULL("403010", "管理域ids为空，不能删除"),
    ERROR_TO_MANY_RESULT("403011", "查询结果数量过大，请缩小查询范围。"),
    ERROR_DATA_IN_AUDIT("403012", "资源信息审核中，禁止同步、修改和删除；请等待审核完成再执行操作"),
    /*
    系统错误：500001-599999
     */
    ERROR_NO_LOGIN("500001", "接口不存在"),
    ERROR_NO_METHOD("500002", "未知方法异常"),
    ERROR_NO_REQUEST("500003", "缺少请求参数"),
    ERROR_READ_REQUEST("500004", "参数解析失败"),
    ERROR_BAD_REQUEST("500005", "参数验证失败"),
    VERIFY_NAME_REQUEST("500006", "当前配置项编码已经存在"),
    ERROR_BIND_REQUEST("500008", "参数绑定失败"),
    ERROR_MATE_REQUEST("500007", "参数不匹配"),
    ERROR_NONSUPPORT_METHOD("500008", "不支持当前请求方法"),
    ERROR_NO_SUPPORTE("500009", "不支持当前媒体类型"),
    ERROR_RUN_DEAL("500010", "服务器错误"),
    ERROR_DEPARTEMENT_PARENT("500011", "不能修改为该部门下的子部门"),
    ERROR_DEPARTEMENT_CHILD_EXIT("500012", "该部门下存在子部门，不能删除"),
    ERROR_DEPARTEMENT_SAME("500013", "内容没有改变，不需要保存"),
    ERROR_DEPARTEMENT_USER_EXIT("500014", "该部门下存在用户，不能删除"),
    VERIFY_SAME_CHINESE_NAME_REQUEST("500015", "当前配置项中文名称已存在，请重新输入"),
    VERIFY_SAME_ENGLISH_NAME_REQUEST("500016", "当前配置项英文名称已存在，请重新输入"),
    VERIFY_SAME_NAME_REQUEST("500017", "当前配置项中文名称、英文名称已存在，请重新输入"),
    VERIFY_SAME_PLAYBOOKNAME_REQUEST("500018", "playbook的名和上传文件名称不一致"),
    ERROR_ANSIBLE_UPLOAD_CFG("600001", "上传ansible.cfg文件出错"),
    ERROR_ANSIBLE_SAVE_TASK("600002", "保存执行计划任务出错"),
    ERROR_ANSIBLE_DELETE_TASK("600003", "删除执行计划任务出错"),

    /**
     * 500以上100000以内是系统错误，Supporte
     */
    CONFIG_ERROR("000601", "参数配置表错误"),
    USER_EXIST("000602", "账号已存在"),
    USERPWD_NOT_EXIST("000603", "用户名不存在或者密码错误"),
    TOPO_ERROR("000604", "拓扑图生成失败"),
    IMAGE_ERROR("000605", "找不到图片"),
    USER_NOT_LOGIN("000606", "用户未认证"),
    CONNECTED_TIMEOUT("000607", "连接超时,请检查服务器地址与端口信息"),
    CONNECTED_FAILURE("000608", "服务器连接失败"),
    CONNECTED_FAILURE_BYAUTH("000609", "连接失败,请检查用户名或者密码信息"),
    ERROR_AUTH_TOKEN("000610","验证失败,请检查token是否过期"),
    ERROR_CONNECTED_FAIL("000611","连接失败,请检查管理域信息是否正确"),
    OPERATION_VM_ERROR("000612", "虚拟机操作失败"),
    H3CVM_NOTFOUND("000613", "找不到指定虚拟机"),
    GET_VM_CONSOLE_ERROR("000614", "获取虚拟机控制台连接失败"),
    GET_H3C_VM_ERROR("000615","获取新华三虚拟机详情失败"),
    GET_H3C_VM_LIST_ERROR("000616","获取新华三虚拟机列表失败"),
    GET_H3C_NETWORK_LIST_ERROR("000617","获取新华三网络列表失败"),
    GET_H3C_OS_LIST_ERROR("000618","获取新华三虚拟化节点列表失败"),
    GET_H3C_IMAGE_LIST_ERROR("000619","获取新华三镜像列表失败"),
    GET_H3C_FLAVOR_ERROR("000620","获取新华三资源规格失败"),
    H3CVM_DETAIL_ERROR("000621","虚拟机配置规格不正确"),
    SEARCH_SINGLE_H3C_FLAVOR_ERROR("000620","获取新华三资源规格失败"),
    CREATE_H3C_VM_ERROR("000620","创建H3C虚拟机失败"),
    OSSSERVER_NOT_FOUND("000621","获取不到指定类型管理域信息"),
    ASSIGN_IP_OF_NETWORK_ERROR("000622","分配网段内空闲IP失败"),

    /**
     * 资源回收提示
     */
    HAS_CANNOT_RECRES("007000","回收列表包含未到期资源"),

    /*
     * 服务编排部分错误107010001
     */
    ATOM_INSTANCE_ERROR("107010001","创建原子服务实例失败"),
    ATOM_INSTANCE_NOT_EXISTS("107010002","原子服务不存在"),
    DELETE_SERVICE_ISUSE("107010003","删除失败,当前服务已经被服务实例引用"),
    APPROVAL_ALREADY("107010004","任务已经审批，请勿重复审批"),
    APPROVAL_BUSINESS_DOMAIN("107010020","任务已被其他负责人处理，请勿重复处理"),
    EXECUTION_ALREADY("107010005","任务已经处理结束，请勿重复提交"),
    RETURNED_ALREADY("107010006","任务已经被退回"),
    TASK_NOT_FIT("107010007","任务类型不匹配"),
    TASK_WRONG_USER("107010008","任务负责人不匹配"),
    SERVICE_STOPPED("107010009","该申请已被停用，请刷新后再试"),
    UPDATE_SERVICE_ISUSE("107010010","更新失败,当前服务已经被服务实例引用"),
    SELECT_ATOM_ERROR("1070100011","查询服务项失败"),
    SERVICE_NAME_NOTNULL("107010012","服务名称不能为空"),
    SERVICE_NAME_EXIST("107010013","名称已经存在"),
    SERVICE_NAME_ISEXIST("107010014","服务名称已经存在"),
    SERVICE_NOT_FOUND("107010015","该任务的服务流程已不存在"),
    SERVICE_CANCEL_ALREADY("107010016","该申请已被申请人撤销，无法进行操作"),
    SERVICE_TERMINATE_ALREADY("107010017","该任务已被终止，请刷新"),
    SERVICE_FINISH_ALREADY("107010018","该任务流程已经结束，请刷新"),
    SERVICE_RETURNED_ALREADY("107010019","该任务流程已被退回，请刷新"),
    OSI_NOTFOUND_TASK("108010001","没找到指定测试任务"),
    OSI_TASK_RECORD("108010002","没找到指定任务记录"),
    OSI_NOMEND_TASK("108010003","整改测试任务失败,有测试项未整改"),
    OSI_NOMEND_TASK_STATUS("108010004","整改测试任务失败,任务状态未在整改中"),
    OSI_NOINFORMMEND_TASK("108010005","通知整改测试任务失败,任务未执行完毕");


    private String code;

    private String msg;

    ErrorCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;

    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
