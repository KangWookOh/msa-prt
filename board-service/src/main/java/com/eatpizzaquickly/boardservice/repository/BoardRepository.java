package com.eatpizzaquickly.boardservice.repository;

import com.eatpizzaquickly.boardservice.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Page<Board> findAllByIsDeleteFalseOrderByCreatedAtDesc(Pageable pageable);
    Page<Board> findAllByUserEmailAndIsDeleteFalseOrderByCreatedAtDesc(String userEmail, Pageable pageable);
}
