import{Given} from "cypress-cucumber-preprocessor/steps"

Given('Visit green commute app', ()=>{
    cy.visit(Cypress.env('url'))
})

    