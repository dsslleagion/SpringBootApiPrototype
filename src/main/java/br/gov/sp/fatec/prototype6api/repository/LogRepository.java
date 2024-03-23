package br.gov.sp.fatec.prototype6api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.gov.sp.fatec.prototype6api.entity.Log;

public interface LogRepository extends JpaRepository<Log,Long>{
}