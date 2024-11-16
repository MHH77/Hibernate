package com.mhh.Hibernate.Domain;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Chapter {
    private String title;
    private Integer chapterNumber;
}
