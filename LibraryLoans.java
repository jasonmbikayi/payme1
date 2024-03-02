package com.payme.payme.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "library_loans")
public class LibraryLoans {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StudID", nullable = false, updatable = true, insertable = true)
	  private int studnid;
	
	@Column(name = "nickname", nullable = false, updatable = true, insertable = true)
	  private String nickname;
	  
	@Column(name = "loan", nullable = false, updatable = true, insertable = true)
	  private String loan;
	  
	@Column(name = "status", nullable = false, updatable = true, insertable = true)
	  private String status;

	public int getStudnid() {
		return studnid;
	}

	public void setStudnid(int studnid) {
		this.studnid = studnid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getLoan() {
		return loan;
	}

	public void setLoan(String loan) {
		this.loan = loan;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LibraryLoans [studnid=" + studnid + ", nickname=" + nickname + ", loan=" + loan + ", status=" + status
				+ "]";
	}
	
	
}
