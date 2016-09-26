package com.example;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testFindGoogle() {
        // Given I open "https://www.google.co.nz/"
        actionwords.iOpenP1("https://www.google.co.nz/");
        // When I search for "Hiptest"
        actionwords.iSearchForP1("Hiptest");
        // Then  a link to “Hiptest – Agile test management tool” is shown in the results
        actionwords.aLinkToHiptestAgileTestManagementToolIsShownInTheResults();
    }
}