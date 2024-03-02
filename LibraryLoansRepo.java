package com.payme.payme.repostory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payme.payme.entity.LibraryLoans;

@Repository
public interface LibraryLoansRepo extends JpaRepository<LibraryLoans,Integer>{

}
