package ae.network.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ae.network.consumer.service.TaskServiceImpl;

@Controller
@RequestMapping("/")
public class TaskController {
    @Autowired
    private TaskServiceImpl service;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView findAll() {
        return new ModelAndView("tasks", "tasks", service.findAll());
    }
}
