package org.hibernate.bugs;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ENTITY_A")
@DiscriminatorColumn(name = "DISC_COL", discriminatorType = DiscriminatorType.INTEGER)
@FilterDef(name = "DUMMY_FILTER", defaultCondition = "(ID IS NOT NULL)")
@Filter(name = "DUMMY_FILTER")
public abstract class AbstractEntityA {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	Integer id;

}