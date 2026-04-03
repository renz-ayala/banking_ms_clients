package com.banking.ms.bankingmsclients.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "clients", schema = "public")
public class Client {
    @Id
    @Column("client_id")
    private Long id;
    @Column("unique_id")
    private String uniqueId;
    @Column("names")
    private String names;
    @Column("last_name")
    private String surnames;
    @Column("document_type")
    private String documentType;
    @Column("document_num")
    private String documentNum;
}
