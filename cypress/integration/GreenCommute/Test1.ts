import { RobotEyes, RobotHands, Dependencies } from '../../robots/GreenCommute/Robot';

context('Test', () => {
const robotEyes = new RobotEyes();
const robotHands = new RobotHands();
const dependencies = new Dependencies()

    describe('Search the required information', ()=>{

        it("navigate to Green commute page", () => {
            dependencies.visitGreenCommute()
            robotEyes.checkIfNavigatedToPage()
        });

        it("enter your location", () => {
            robotHands.enterYourLocation()    
            robotHands.clickOnNextButton()
                        
        })

        it("enter your job location", () => {
            robotHands.enterYourJobLocation()    
            robotHands.clickOnNextButton()
                        
        })

        it("enter your skills", () => {
            robotHands.enterYourSkills(Cypress.env('skillSearchValue'))
            robotHands.clickOnFinishButton()
                        
        })

        it("verify if navigated to find jobs page", () => {
            robotEyes.checkForTextOnNaviationBar()
            cy.pause()
        })

        it("Selecting options in filter", () => {
                robotHands.clickOnFilter()
                robotHands.clickOnDistanceCheckBox(Cypress.env('distanceValue'))
                // robotEyes.seeIfCheckBoxChecked()
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