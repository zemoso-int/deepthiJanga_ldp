describe('First test', () => {
    it('loads the page', () => {
        cy.visit('https://example.cypress.io')
        cy.contains('type').click()
        cy.url().should('include', '/commands/actions')
        cy.get('.action-email')
          .type('deepthi@email.com')
          .should('have.value', 'deepthi@email.com')

        cy.get('.action-form')
          .find('[type="text"]').type('Deepthi')

        cy.get('.action-form').submit()
          .next().should('contain', 'Your form has been submitted!')  

        cy.get('.action-radios [type="radio"]').not('[disabled]')
          .check().should('be.checked')
          
        cy.get('.action-radios [type="radio"]')
           .check('radio3', { force: true }).should('be.checked')
        
        cy.get('#scroll-horizontal button')
           .should('not.be.visible')
         
        cy.get('#scroll-horizontal button').scrollIntoView()
           .should('be.visible')
         
        cy.get('#scroll-vertical button')
           .should('not.be.visible')
         
        cy.get('#scroll-vertical button').scrollIntoView()
           .should('be.visible')
         
        cy.get('#scroll-both button')
           .should('not.be.visible')
         
        cy.get('#scroll-both button').scrollIntoView()
           .should('be.visible')  
           
        cy.get('.action-check [type="checkbox"]')
          .not('[disabled]')
          .uncheck().should('not.be.checked') 
          
    
        cy.go('back')
        cy.contains('contains').click()
        cy.url().should('include', '/commands/querying')
        cy.get('.query-btn').should('contain', 'Button')

    })
})