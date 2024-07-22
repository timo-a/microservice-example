package org.example.microservice.domain;

import org.assertj.assertions.generator.GenerateAssertion;

@GenerateAssertion
public record Item(String name, Integer value) {
}
