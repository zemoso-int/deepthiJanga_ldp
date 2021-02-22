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
        });

              
        it("enter your skill and Reload page", () => {
            robotHands.enterYourSkills(Cypress.env('skillSearchValue'))
            robotHands.pageReload()
            robotEyes.seesYourSkillFieldValue("");                        
        })

        
    });

});