import { RobotEyes, RobotHands, Dependencies } from '../../robots/GreenCommute/Robot';

context('Test', () => {
const robotEyes = new RobotEyes();
const robotHands = new RobotHands();
const dependencies = new Dependencies();
let Data ="";


    describe('Search the required information', ()=>{
        beforeEach(() => {
            cy.fixture('commute').then(function(data) {
                 Data = data;
            })
        })

        it("navigate to Skill page", () => {
            dependencies.visitGreenCommute()
            robotEyes.checkIfNavigatedToPage() 
            robotHands.enterYourLocation()    
            robotHands.clickOnNextButton()
            robotHands.enterYourJobLocation()    
            robotHands.clickOnNextButton()
        });

              
        it("select skills and remove", () => {
            robotHands.enterYourSkills(Cypress.env('skillSearchValue'))
            robotHands.removeSelectedSkill()
            robotEyes.seeNUmberOfSkillsSelected(0);          
        })

        
    });

});