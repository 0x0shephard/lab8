@Test
public void testHasCity() {
    CustomList list = new CustomList();
    City calgary = new City("Calgary", "AB");
    list.addCity(calgary);

    // Now this will compile and pass!
    assertTrue(list.hasCity(calgary));
}