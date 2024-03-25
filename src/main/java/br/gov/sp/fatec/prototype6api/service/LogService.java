package br.gov.sp.fatec.prototype6api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.prototype6api.entity.Log;
import br.gov.sp.fatec.prototype6api.repository.LogRepository;

@Service
public class LogService {

    @Autowired
    private LogRepository logRepo;

    public Log buscarPorId(Long id) {
        Optional<Log> logOp = logRepo.findById(id);
        if (logOp.isPresent()) {
            return logOp.get();
        }
        throw new IllegalArgumentException("Id inválido!");
    }

    public Log novoLog(Log log) {
        if (log == null || log.getEntradaSaida() == null || log.getDataRegistro() == null) {
            throw new IllegalArgumentException("Dados inválidos!");
        }
        return logRepo.save(log);
    }
    

    public List<Log> buscarTodos() {
        return logRepo.findAll();
    }
}
