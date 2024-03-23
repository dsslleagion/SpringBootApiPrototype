package br.gov.sp.fatec.prototype6api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.prototype6api.entity.Log;
import br.gov.sp.fatec.prototype6api.service.LogService;

@RestController
@RequestMapping(value = "/log")
@CrossOrigin
public class LogController { 
    @Autowired
    private LogService service;

    @GetMapping
    public List<Log> buscarTodosLogs() {
        return service.buscarTodos();
    }

    @PostMapping
    public Log cadastrarNovoLog(@RequestBody Log log) {
        return service.novoLog(log);
    }

    @GetMapping(value = "/{id}")
    public Log buscarLogPorId(@PathVariable("id") Long id) {
        return service.buscarPorId(id);
}
}