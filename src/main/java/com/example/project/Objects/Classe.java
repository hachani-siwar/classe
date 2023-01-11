package com.example.project.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("classe")
public class Classe {
    @Id
    private String id;
    @Field("name")
    @Indexed(unique = true)
    private String name;
    @Field("grade")
    private String classeGrade;

}
