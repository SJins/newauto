package com.su.selfcoding.selfcoding.entity;

import com.su.selfcoding.common.BaseEntity;
import java.time.LocalDateTime;
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
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Userrec extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer touid;

    private Integer beuid;

    private Integer shell;

    private LocalDateTime createtime;


}
