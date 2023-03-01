package org.perscholas.budgettracker.controller;

import org.perscholas.budgettracker.dao.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class BudgetTrackerController {

    private UserRepository repository;

}
