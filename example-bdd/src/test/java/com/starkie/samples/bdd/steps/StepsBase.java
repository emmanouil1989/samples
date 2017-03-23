package com.starkie.samples.bdd.steps;

import org.springframework.test.context.ContextConfiguration;

import com.starkie.samples.bdd.utils.AppConfig;

import cucumber.api.java8.En;

@ContextConfiguration(classes = {AppConfig.class})
public class StepsBase implements En {

}