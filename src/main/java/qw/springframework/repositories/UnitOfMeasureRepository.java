package qw.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import qw.springframework.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
