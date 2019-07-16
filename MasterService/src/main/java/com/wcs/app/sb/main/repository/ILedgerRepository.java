package com.wcs.app.sb.main.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.wcs.app.sb.main.model.Ledger;
@Repository
public interface ILedgerRepository extends PagingAndSortingRepository<Ledger, Integer>{
	public Ledger save(Ledger l);
	public List<Ledger> findAll();
}
