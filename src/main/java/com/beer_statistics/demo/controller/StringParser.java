package com.beer_statistics.demo.controller;

import com.beer_statistics.demo.service.DataInputParser;

class StringParser extends DataInputParser{

    void test(){
        final DataInputParser dataInputParser = new DataInputParser();
        final String name = dataInputParser.name;
        final String name2 = dataInputParser.name2;
    }

    void test2(){
        final StringParser stringParser = new StringParser();
        final String name = stringParser.name;
        final String name2 = stringParser.name2;
    }
}
