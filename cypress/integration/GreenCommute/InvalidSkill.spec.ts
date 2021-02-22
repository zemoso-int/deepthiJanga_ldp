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

              
        it("enter invalid skill", () => {
            robotHands.enterInvalidSkill(Cypress.env('InvalidSkill'))
            robotEyes.seesNoOptionsText(Data);                        
        })

        
    });

});