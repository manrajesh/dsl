package com.example.dsl;

import com.example.dsl.entity.Town;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dto {
    private String name;
    private Set<Town> towns;

}
