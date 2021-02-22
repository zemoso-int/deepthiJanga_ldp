import { RobotEyes, RobotHands, Dependencies } from '../../robots/GreenCommute/Robot';

context('Test', () => {
const robotEyes = new RobotEyes();
const robotHands = new RobotHands();
const dependencies = new Dependencies()

    describe('Verify Filter functionality', ()=>{

        it("navigate to Green commute home page", () => {
            dependencies.visitGreenCommute()
            robotEyes.checkIfNavigatedToPage()
            robotHands.enterYourLocation()    
            robotHands.clickOnNextButton()
            robotHands.enterYourJobLocation()    
            robotHands.clickOnNextButton()
            robotHands.enterYourSkills(Cypress.env('skillSearchValue'))
            robotHands.clickOnFinishButton()
        });

            it("verify if navigated to find jobs page", () => {
            robotEyes.checkForTextOnNaviationBar()
            cy.pause()
        })
        
        it("Selecting options in filter", () => {
                robotHands.clickOnFilter()
                robotHands.clickOnDistanceCheckBox(Cypress.env('distanceValue'))
                robotHands.clickOnDatePostedCheckBox()
                robotHands.clickOnGreenCommuteCheckBox()
                robotHands.clickOnJobTypeCheckBox()
                robotHands.clickOnExperienceCheckBox()
                robotHands.clickOnTransportCheckBox()
                robotHands.clickOnApplyButton()
                robotHands.clickOnClearAll()
        })

        

    });

});