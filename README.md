# SzkolaTestowOlaKunysz
This is repo about unit testing. My learning and exercises with course: Szkoła Testów by Ola Kunysz.
https://szkolatestow.online/

## Table of contents
* [General info](#general-info)
* [Screenshots](#screenshots)
* [Technologies](#technologies)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
The project consists of four modules:
- Module I - first unit test written
- Module II - tools for testing: JUnit, AssertJ
- Module III - TDD - Coding Dojo - excercises: Bowling
- Module IV - 

## Screenshots
d:/test.png

## Technologies
* Java - version 13
* JUnit - version 4.12
* Maven - version 13
* AssertJ - version 3.19.0
* Mockito - version 3.8.0

## Code Examples
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class VatServiceTest {
    VatService vatService;
    VatProvider vatProvider;

    @Test
    void should_calculate_gross_price_for_default_vat() throws IncorrectVatException {
        //given
        String type = "Groceries";
        Mockito.when(vatProvider.getDefaultVat()).thenReturn(0.23);
        Product product = generateProduct("1", 100, type);

        //when
        double result = vatService.getGrossPriceForDefaultVat(product);

        //then
        //JUnit
        assertEquals(123, result);

        //AssertJ
        assertThat(result).isEqualTo(123);
    }


## Status
During the implementation of the training

## Inspiration
My main motivation is learn unit testing and to be a better programmer - currently I'm a developer wanna be:)

## Contact
Created by RobertoJavaDev@gmail.com - feel free to contact me!
