(function() {
	'use strict';
	var app = angular.module(
			'app',
			[ 'ngRoute', 'ngAnimate', 'ui.bootstrap', 'easypiechart',
					'mgo-angular-wizard', 'textAngular', 'ui.tree',
					'ngTagsInput']).config(
			[ '$routeProvider',function($routeProvider) {

				$routeProvider
					.when('/Clientformation', {
					templateUrl: 'views/formation.html',
					controller: 'FormationCtrl',
					controllerAs: 'formation'
				})
					.when('/Clientformation/:codeFormation', {
						templateUrl: 'views/infoFormation.html',
						controller: 'FormationInfoCtrl',
						controllerAs: 'formationInfo'
					})
					.when('/Ajouterformation', {
						templateUrl: 'views/ajouterFormation.html',
						controller: 'FormationAddCtrl',
						controllerAs: 'formationAdd'
					})
					.when('/Updateformation/:codeFormation', {
						templateUrl: 'views/updateFormation.html',
						controller: 'FormationUpdateCtrl',
						controllerAs: 'formationUpdate'
					})
					.when('/', {
						templateUrl: 'views/Acceuil.html'
					})
                    .when('/Clientenseignant',{
                        templateUrl: 'views/enseignant.html',
                        controller: 'EnseignantCtrl',
                    })
                    .when('/Clientenseignant/:noEnseignant', {
                        templateUrl: 'views/infoEnseignant.html',
                        controller: 'EnseignantInfoCtrl'

                    })
					.when('/AjouterEnseignant', {
						templateUrl: 'views/ajouterEnseignant.html',
						controller: 'EnseignantAddCtrl'

					})
					.when('/UpdateEnseignant/:noEnseignant', {
						templateUrl: 'views/updateEnseignant.html',
						controller: 'EnseignantUpdateCtrl'
					})


			} ]
    )

}).call(this);
