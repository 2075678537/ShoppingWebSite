package com.whx.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author o浩Y旭o
 * @create 2019-11-27-13:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consumer {
    private int   consumer_id;
    private String consumer_username;
    private String consumer_password;
}
