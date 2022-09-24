package com.feather.assistant.account;

import com.feather.assistant.$Entity.AccountEntity;
import com.feather.assistant.$CommonFIle.AssistantApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountRepository accountRepository;


    @AssistantApiResponse
    @GetMapping("/ls")
    public List<AccountEntity> getAllAccount() {
        return accountRepository.findAll();
    }

    @AssistantApiResponse
    @PostMapping("/s")
    public void setAccount(@RequestBody AccountEntity accountEntity) {
        accountRepository.save(accountEntity);
    }

    @DeleteMapping("/d")
    public void deleteAccount(@RequestParam("id_account") Integer id_account) {
        accountRepository.deleteById(id_account);
    }
}
