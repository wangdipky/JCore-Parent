package vn.com.v4v.audit;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Name: AbstractCreateAuditDto
 * Author: QuangDK
 * Version: 1.0.0
 * CreatedDate: 06/07/2025
 */
@NoArgsConstructor
@Setter
@Getter
public class AbstractCreateAuditDto {

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;
}