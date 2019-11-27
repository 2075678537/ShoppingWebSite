package com.whx.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author o浩Y旭o
 * @create 2019-11-27-13:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consumer_permission {
     private int Consumer_permission_id;
     private int permission_id;
     private int consumer_id;
     

}
