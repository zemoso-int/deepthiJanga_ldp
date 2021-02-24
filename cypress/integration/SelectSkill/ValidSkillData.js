import { Given , And , Then , When} from "cypress-cucumber-preprocessor/steps";

//test steps 
Given('User have launched the green commute application', () => {
cy.visit(Cypress.env('url'));
cy.title().should('include', Cypress.env('pageTitle'))
})

And('User will navigate to Your skills page', () => {
    cy.get('[placeholder="Enter your location"]').type(Cypress.env('yourLocation')).type('{downarrow}').type('{enter}')
    cy.contains('Next').click()
    cy.get('[placeholder="Enter your job location"]').type(Cypress.env('jobLocation')).type('{downarrow}').type('{enter}')
    cy.contains('Next').click()
})

When ('User enter valid skill in enter your skill field', () => {
    cy.get('[placeholder="Enter your skills"]').type(Cypress.env('validSkill'))
})

Then ('User will see the auto suggestions of skill entered' , () => {
    length =cy.get('.MuiAutocomplete-listbox').eq(0).find('li').length
        for(let i ;i < length ;i++){ 
          cy.get('.MuiAutocomplete-listbox').eq(0).find('li').eq(i).should('contain',Cypress.env('validSkill'))
        }
})

