package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class TransferPage {
    private SelenideElement amountField = $("[data-test-id=\"amount\"] input");
    private SelenideElement fromField = $("[data-test-id=from] input");
    private SelenideElement transferButton = $("[data-test-id=action-transfer]");

    public void transferCard(DataHelper.CardInfo fromCardInfo) {
        String amountToAdd = "300";
        amountField.setValue(amountToAdd);
        fromField.setValue(fromCardInfo.getCardNumber());
        transferButton.click();
    }
}
