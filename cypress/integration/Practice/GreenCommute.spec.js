/// <reference types="cypress" />

context('Actions', () => {
    beforeEach(() => {
      cy.visit('http://bc15-green-commute.dev-apps.io/')
      cy.title().should('include', 'Green Commute')
    })
        it('Selecting your location, job location and skills', () => {
        cy.get('[placeholder="Enter your location"]').type('hyderabad').type('{downarrow}').type('{enter}')
        cy.contains('Next').click()
        cy.get('[placeholder="Enter your job location"]').type('Mumbai').type('{downarrow}').type('{enter}')
        cy.contains('Next').click()
        cy.get('[placeholder="Enter your skills"]').type('Software Engineer').type('{downarrow}').type('{enter}')
        cy.contains('Finish').click()

        cy.get('[data-testid="nav-bar"]').find('h6')
          .should('contains.text', 'Green Commute')

        cy.get('[data-testid="filterButton"]').click()
        cy.get('[name="0-10 kms"][type="checkbox"]').check()
          .should('be.checked')
          
        cy.get('[name="Anytime"][type="checkbox"]').check()
          .should('be.checked')
        cy.get('[name="Yes"][type="checkbox"]').check()
          .should('be.checked')
        cy.get('[name="Full Time"][type="checkbox"]').check()
          .should('be.checked')
        cy.get('[name="Mid-level"][type="checkbox"]').check()
          .should('be.checked')
        cy.get('[name="Motor cycle"][type="checkbox"]').check()
          .should('be.checked')
        cy.contains('Apply').click()
        cy.contains('clear all').click()
        cy.get('[data-testid="cardLabel-placeholder"]').eq(1).click()
        cy.get('[data-testid="jobDetailsHeader-placeholder"]').find('button').find('span')
          .should('contains.text', 'Save')
        cy.get('[data-testid="jobDetailsHeader-placeholder"]').find('button').find('span').eq(2)
          .should('contains.text', 'Apply')
        cy.get('[data-testid="job-details"]').should('contains.text', 'Green Commute Routes')    
        cy.get('[data-testid="jobDetailsHeader-placeholder"]').find('button').find('span').contains('Save').click()
        cy.contains('Saved Jobs').click()   
        cy.url().should('include', '/savedJobs') 

    }) 
})
