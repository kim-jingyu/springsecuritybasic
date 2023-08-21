package com.eazybytes.controller;

import com.eazybytes.model.Loans;
import com.eazybytes.repository.LoansRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoansController {
    private final LoansRepository loansRepository;

    @GetMapping("/myLoans")
//    @PostAuthorize("hasRole('USER')")
    public List<Loans> getMyLoans(@RequestParam int id) {
        List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDtDesc(id);
        if (loans != null) {
            return loans;
        } else {
            return null;
        }
    }
}
