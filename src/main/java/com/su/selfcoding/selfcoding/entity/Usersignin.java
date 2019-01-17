package com.su.selfcoding.selfcoding.entity;

import java.time.LocalDateTime;
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
public class Usersignin implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private LocalDateTime signintime;

    private Integer shell;


}
