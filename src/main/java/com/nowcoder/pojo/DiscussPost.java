package com.nowcoder.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DiscussPost {
    private Integer id;
    private String userId;
    private String title;
    private String content;
    private Short type;
    private Short status;
    private LocalDateTime createTime;
    private Integer commentCount;
    private Double score;
}
