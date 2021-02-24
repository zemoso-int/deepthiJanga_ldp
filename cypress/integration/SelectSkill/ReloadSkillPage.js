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

When ('User select a skill', () => {
    cy.get('[placeholder="Enter your skills"]').type(Cypress.env('validSkill')).type('{downarrow}').type('{enter}')
})

And ('refreshes the page', () => {
    cy.reload()
})

Then ('User will see no skill selected' , () => {
    cy.get('[data-testid="input-field"]').should('not.have.class','MuiChip-root jss259 MuiAutocomplete-tag MuiChip-outlined MuiChip-sizeSmall MuiChip-deletable')
})

