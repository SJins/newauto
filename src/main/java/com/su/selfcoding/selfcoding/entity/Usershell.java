package com.su.selfcoding.selfcoding.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jin
 * @since 2019-01-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Usershell implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer shell;

    private LocalDate startdate;

    private LocalDate enddate;

    private Integer type;

    private Integer uid;


}
