package com.froma.pc.apply;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ApplyTest extends AbstractTest{

    @Before
    public void setUp() throws Exception {
        driver = FanSpRemoteWebDriverFactory.create();
    }

    @Test
    public void 正常_応募入力_完了() throws Exception {
        driver.manage().deleteAllCookies();
        
        JobDetailPage detailPage = getJobDetailPageByRqmtId("rqmtId");
        ApplyInputPage applyInput = detailPage.clickApplyUpper();
        ApplyConfirmPage applyConfirm = applyInput.typeFurigana("").typeKanjiSimei("").typePhone("").selectBrthDay("").submitApply();
        ApplyDonePage applyDone = applyConfirm.clickConfirm();
        assertTrue(applyDone.lblApplyDone.getText().contains("This is an awesome comment"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
