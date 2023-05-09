package com.example.sqlindexing.repository;

import com.example.sqlindexing.domain.Indexing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexingRepository extends JpaRepository<Indexing, Long> {
}
