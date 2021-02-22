import { RobotEyes, RobotHands, Dependencies } from '../../robots/GreenCommute/Robot';

context('Test', () => {
const robotEyes = new RobotEyes();
const robotHands = new RobotHands();
const dependencies = new Dependencies()

    describe('Search the required information', ()=>{

        it("navigate to Skill page", () => {
            dependencies.visitGreenCommute()
            robotEyes.checkIfNavigatedToPage() 
            robotHands.enterYourLocation()    
            robotHands.clickOnNextButton()
            robotHands.enterYourJobLocation()    
            robotHands.clickOnNextButton()
            robotHands.enterYourSkills(Cypress.env('skillSearchValue'))
            robotHands.clickOnFinishButton()    
        })

        it("verify if navigated to find jobs page", () => {
            robotEyes.checkForTextOnNaviationBar()
            robotEyes.seeFindJobsPageUrlExtension()
        })
        
       
        it('Saving a job', () => {
            robotHands.clickOnJobCard()
            robotEyes.seeForGreenCommuteRouteButton()
            robotEyes.seeTextOnSaveButton()
            robotHands.clickOnSaveButton();
        });
    
        it('Navigate to saved Jobs page', () => {
            robotHands.clickOnSavedJobs()
            robotEyes.seeSavedJobsPageUrlExtension()
        })

    });

});