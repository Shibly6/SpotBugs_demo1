package com.example.spotbugs_demo;

import com.example.spotbugs_demo.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}