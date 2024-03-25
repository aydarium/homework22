package ru.aydar.tests;

import ru.aydar.extensions.WithLogin;
import ru.aydar.pages.ProfilePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Проверки страницы профиля")
public class ProfileTest extends TestBase {
    ProfilePage profilePage = new ProfilePage();

    @Test
    @WithLogin
    @DisplayName("Проверка пустого списка книг")
    void emptyBookListTest() {
        profilePage
                .openPage()
                .checkEmptyCellsInList()
                .checkEmptyListMessage();
    }
}
