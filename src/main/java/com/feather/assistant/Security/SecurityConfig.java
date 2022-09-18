package com.feather.assistant.Security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Security 預設規定所有 API，都要先通過身份驗證才可存取。即使在匯入完成後，什麼程式都沒寫也會生效，除非被覆寫。
 * 然而我們還沒有建立好授權機制，若讀者使用 Postman 之類的工具發送請求，一律會收到 HTTP 401（Unauthorized）的狀態碼。
 *
 * 若在該方法中尚未設置任何規則，則 API 又恢復到能存取的狀態。
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // TODO
    }
}
