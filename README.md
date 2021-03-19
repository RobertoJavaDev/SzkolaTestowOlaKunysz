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
- Module III - 
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
    @Test
    @DisplayName("should calculate gross price for default VAT")
    void shouldCalculateGrossPriceForDefaultVat() throws IncorrectVatException {
        //given
        when(vatProvider.getDefaultVat()).thenReturn(new BigDecimal(0.23));
        Product product = generatedProduct("20.00", "Clothes");

        //when
        BigDecimal result = vatService.getGrossPriceForDefaultVat(product);

        //then
        assertThat(result).isEqualTo(new BigDecimal("24.60"));


## Status
During the implementation of the training

## Inspiration
My main motivation is learn unit testing and to be a better programmer - currently I'm a developer wanna be:)

## Contact
Created by RobertoJavaDev@gmail.com - feel free to contact me!
