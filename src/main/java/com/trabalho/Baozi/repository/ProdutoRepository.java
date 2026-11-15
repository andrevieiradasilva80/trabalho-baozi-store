package com.trabalho.Baozi.repository;
import com.trabalho.Baozi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}